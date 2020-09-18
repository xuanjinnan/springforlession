package com.pactera.ioc.bean;

/**
 * 静态工厂方法创建 Bean
 */
public class StaticFactoryMethodService {
    private static StaticFactoryMethodService staticFactoryMethodService =
            new StaticFactoryMethodService();
    private StaticFactoryMethodService() {}

    public static StaticFactoryMethodService createInstance() {
        return staticFactoryMethodService;
    }
    public void sayHello(){
        System.out.println("static factory method bean say hello!");
    }
}