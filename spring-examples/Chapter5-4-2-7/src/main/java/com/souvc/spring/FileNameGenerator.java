package com.souvc.spring;

public class FileNameGenerator
{
	private String name;
	private String type;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "FileNameGenerator{" +
				"name='" + name + '\'' +
				", type='" + type + '\'' +
				'}';
	}
}