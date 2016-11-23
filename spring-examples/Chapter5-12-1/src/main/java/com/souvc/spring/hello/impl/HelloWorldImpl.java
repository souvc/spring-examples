package com.souvc.spring.hello.impl;

import com.souvc.spring.hello.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

	public void printHelloWorld(String msg) {

		System.out.println("Hello : " + msg);
	}

}