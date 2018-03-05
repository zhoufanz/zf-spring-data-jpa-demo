package com.example.demo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle extends ResultUtil{

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResultEntity handle(Exception ex) {
        return returnException(ex.getMessage());
    }
}
