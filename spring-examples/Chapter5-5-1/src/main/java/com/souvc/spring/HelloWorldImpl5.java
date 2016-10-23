package com.souvc.spring;
 
public class HelloWorldImpl5 implements HelloWorld{
 
    public void sayHello(String name) {
        doSomeThing(name);
    }

    private void doSomeThing(String name) {
        System.out.println("HelloWorldImpl5,"+name);
    }

}