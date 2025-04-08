package com.xyz.oops.inheritance;

public class MethodsExample {
	
	static void sampleMethod(int x) {
		System.out.println(x);
	}
	
	static void sampleMethod2(String name) {
		System.out.println(name);
	}
	
	static void sampleMethod3(MethodsExample refname) {
		
	}
	public static void main(String[] args) {
		int x = 10;
		String name = "Madhav";
		MethodsExample refName = new MethodsExample();
		MethodsExample.sampleMethod(10);
		MethodsExample.sampleMethod2("Pavan");
		MethodsExample.sampleMethod3(new MethodsExample());
	}
}
