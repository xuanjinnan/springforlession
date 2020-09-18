package com.pactera.ioc.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    @Test
    public void test1(){
        ApplicationContext context =  new ClassPathXmlApplicationContext(new String[] {"services.xml"});
        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.sayHello();


    }
}