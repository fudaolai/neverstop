package com.example.neverstop.aop;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aopTest")
@Slf4j
public class AopController {




    @PostMapping("hello")
    public String aopTest(String text){
        return "测试aop" + text;

    }



}
