package com.souvc.spring;
 
public class HelloWorldImpl2 implements HelloWorld{
 
    public void sayHello(String name) {
        doSomeThing(name);
    }

    private void doSomeThing(String name) {
        System.out.println("HelloWorldImpl2,"+name);
    }

}