package com.pactera;

import com.pactera.aop.Calculator;
import com.pactera.aop.Cap10MainConfig;
import com.pactera.ioc.bean.HelloWorld;
import com.pactera.ioc.bean.InstanceFactoryMethodService;
import com.pactera.ioc.bean.StaticFactoryMethodService;
import com.pactera.ioc.di.ExampleBean;
import com.pactera.ioc.di.ExampleBean2;
import com.pactera.ioc.di.ExampleBean3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test1(){
        ApplicationContext context =  new ClassPathXmlApplicationContext(new String[] {"services.xml"});
        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.sayHello();

        StaticFactoryMethodService staticFactoryMethodService = context.getBean("staticFactoryMethodService",
                StaticFactoryMethodService.class);
        staticFactoryMethodService.sayHello();

        InstanceFactoryMethodService instanceFactoryMethodService = context.getBean("instatnceFactoryMethodService",
                InstanceFactoryMethodService.class);
        instanceFactoryMethodService.sayHello();
    }
    @org.junit.Test
    public void test2(){
        ApplicationContext context =  new ClassPathXmlApplicationContext(new String[] {"services.xml"});
        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
        exampleBean.sayHello();

        ExampleBean2 exampleBean2 = context.getBean("exampleBean2", ExampleBean2.class);
        exampleBean2.sayHello();

        ExampleBean3 exampleBean3 = context.getBean("exampleBean3", ExampleBean3.class);
        exampleBean3.sayHello();
    }
    @org.junit.Test
    public void test3(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap10MainConfig.class);
        Calculator c = app.getBean(Calculator.class);
        int result = c.div(4, 3);
        System.out.println(result);
        app.close();
    }
}
