package com.example.neverstop.config;

import com.example.neverstop.aop.LogAspects;
import com.example.neverstop.aop.MathInts;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class AopConfig {


    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }

    @Bean
    public MathInts mathInts(){
        return new MathInts();
    }

}
