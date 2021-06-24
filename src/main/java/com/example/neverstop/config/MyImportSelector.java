package com.example.neverstop.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author daolai.fu
 * @desc 测试自动注入importSelector 返回String数组，包含要注册到ioc容器的全类路径名组件
 * @Date 2021-06-24 22:59
 */
public class MyImportSelector implements ImportSelector {


    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.example.neverstop.ns.entity.test.User","com.example.neverstop.ns.entity.test.Depart"};
    }
}
