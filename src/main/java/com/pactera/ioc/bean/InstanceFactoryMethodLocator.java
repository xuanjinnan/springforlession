package com.pactera.ioc.bean;

/**
 * 实例工厂方法创建 Bean
 */
public class InstanceFactoryMethodLocator {

    private static InstanceFactoryMethodService instanceFactoryMethodService = new InstanceFactoryMethodService();

    public InstanceFactoryMethodService createInstance() {
        return instanceFactoryMethodService;
    }
}

