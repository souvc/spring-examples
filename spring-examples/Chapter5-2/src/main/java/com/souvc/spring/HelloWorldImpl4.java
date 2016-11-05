package com.souvc.spring;
 
public class HelloWorldImpl4 implements HelloWorld{
 
    public void sayHello(String name) {
        doSomeThing(name);
    }

    private void doSomeThing(String name) {
        System.out.println("HelloWorldImpl4,"+name);
    }

}