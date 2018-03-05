package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${cupSize}")
    private String cupSize;

    @Value("${content}")
    private String content;

    @Autowired
    private PersonProperties personProperties;
    @GetMapping("/say/{id}")
    public String say(@PathVariable String id,@RequestParam(value = "id2",required = false,defaultValue = "0") String id3){
//        return personProperties.getName();
        return id3;
    }
}
