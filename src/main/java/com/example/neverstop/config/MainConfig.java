package com.example.neverstop.config;

import com.example.neverstop.ns.entity.test.Color;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author daolai.fu
 * @desc 测试通过@import 注册bean组件到ioc容器
 * @Date 2021-06-24 23:08
 */

@Configuration
@Import({Color.class,MyImportSelector.class})
public class MainConfig {

}
