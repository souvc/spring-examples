package com.souvc.spring;

/**
 * Spring bean
 *
 */
public class HelloWorld {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Hello ! " + name);
	}
}