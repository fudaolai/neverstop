package com.example.neverstop;

import com.example.neverstop.aop.MathInts;
import com.example.neverstop.config.AopConfig;
import com.example.neverstop.config.MainConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class NeverStopApplicationTests {

	@Test
	void contextLoads() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
		MathInts mathInts = applicationContext.getBean(MathInts.class);
		System.out.println(mathInts);

		int anInt = mathInts.getInt(4, 2);
		System.out.println("容器结果" + anInt);

	}


	@Test
	void test1(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
	}

}
