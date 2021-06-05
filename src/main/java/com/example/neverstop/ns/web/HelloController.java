package com.example.neverstop.ns.web;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {


    @PostMapping("/test")
    public String hello(){

        return "helloWorld";
    }


}
