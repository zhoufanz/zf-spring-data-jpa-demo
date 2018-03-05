package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    @GetMapping("/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    @PostMapping("/girlAdd")
    @ResponseBody
    public Girl girlAdd(@RequestBody Girl girl){
        Girl save = this.girlRepository.save(girl);
        return save;
    }
    @PutMapping("/girlUpdate")
    @ResponseBody
    public Girl girlUpdate(@RequestBody Girl girl){
        Girl save = this.girlRepository.save(girl);
        return save;
    }

    @GetMapping("/girlFindOne/{id}")
    @ResponseBody
    public Girl girlFindOne(@PathVariable("id") Integer id){
        return this.girlRepository.getOne(id);
    }

    @DeleteMapping("/girlDelete/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        this.girlRepository.deleteById(id);
    }

    @ResponseBody
    @GetMapping("/girls/age/{age}")
    public List<Girl> getGirlByAge(@PathVariable("age") Integer age) {
        return this.girlRepository.findByAge(age);
    }


    @PostMapping("/girlAddTwo")
    @ResponseBody
    public void girlAddTwo(){
         this.girlService.insertTwo();
    }
}
