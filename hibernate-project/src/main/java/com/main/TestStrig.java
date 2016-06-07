package com.main;

public class TestStrig {

	private int a;
	private String name;
	
	public TestStrig(){
		
	}

	public TestStrig(int a, String name) {
		super();
		System.out.println("constructor begin.");
		this.a = a;
		System.out.println("constructor done.");
		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		System.out.println("setA call");
		this.a = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestStrig [a=" + a + ", name=" + name + "]";
	}
}
