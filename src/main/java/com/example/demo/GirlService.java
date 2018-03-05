package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional()
    public void insertTwo(){
        Girl girl = new Girl();
        girl.setAge(11);
        girl.setCupSize("ddd");
        this.girlRepository.save(girl);

        Girl girl1 = new Girl();
        girl1.setAge(15);
        girl1.setCupSize("ffff");
        this.girlRepository.save(girl1);
    }
}
