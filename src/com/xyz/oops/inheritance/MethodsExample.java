package com.xyz.oops.inheritance;

public class MethodsExample {
	
	static void sampleMethod(int x) {
		System.out.println(x);
	}
	
	static void sampleMethod2(String name) {
		System.out.println(name);
	}
	
	void add() {
		System.out.println(2+3);
	}
	static void sampleMethod3(MethodsExample refname) {
		refname.add();
	}
	public static void main(String[] args) {
		int x = 10;
		byte y = 20;
		boolean cond= true;
		
		String name = new String();
		
		MethodsExample refName = new MethodsExample();
		
		MethodsExample.sampleMethod(10);
		MethodsExample.sampleMethod2("Pavan");
		MethodsExample.sampleMethod3(new MethodsExample());
	}
}
