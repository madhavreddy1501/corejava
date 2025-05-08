package com.xyz.oops.java8;

@FunctionalInterface
interface Student {
	public void studentName(int x,String name);
	
	public static void staticMethod() {
		
	}
	
	default void method() {
		System.out.println("Pavan");
	}
}

public class LambDaExpression {
	public static void main(String[] args) {
//		() -> {
//			//Lambda Expression
//		}
		Student student= (x,y) -> {
			System.out.println("Hi This Lambda"+x + y);
		};
		
		student.studentName(10,"Pavan");
		
		student.method();
	}
}
