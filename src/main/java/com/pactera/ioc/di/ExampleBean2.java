package com.pactera.ioc.di;

public class ExampleBean2 {

    private ExampleBean2(String string) {
    }

    public static ExampleBean2 createInstance (AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {

        ExampleBean2 eb = new ExampleBean2 ("String");
        return eb;
    }
    public void sayHello(){
        System.out.println("Constructor DI ExampleBean2 say hello!");
    }
}
