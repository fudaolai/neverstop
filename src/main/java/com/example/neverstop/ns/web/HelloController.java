package com.example.neverstop.ns.web;


import com.example.neverstop.config.MainConfig;
import com.example.neverstop.ns.entity.test.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 初始测试类
 * @author daolai.fu
 */

@RestController
@RequestMapping("/hello")
@Api(value = "你好，swagger")
public class HelloController {


    @PostMapping("/test")
    @ApiModelProperty(value = "测试hello接口")
    @ApiImplicitParam(paramType="query", name = "blogName", value = "字段描述", required = true, dataType = "String",defaultValue = "daolai.fu")
    public String hello(@RequestParam String blogName){

        return "helloWorld" + blogName;
    }


    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        User user = applicationContext.getBean(User.class);

        System.out.println(user);


    }

}
