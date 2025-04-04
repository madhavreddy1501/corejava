package com.xyz.oops.inheritance;
//Abstraction can achive by using Interface or Abstract class because of abstract methods
//By using Abstract class we can achive only partial abstraction.

//create an abstract class 
//create an abstract method
//create a class
// give relation father class son class
//implement fatherMethod inside son class (i.e method override)
//we to do up-casting

abstract class Father {
	abstract void fatherMethod();
}

class Son extends Father{
	
	int x = 20;
	
	@Override
	void fatherMethod() {
		System.out.println("father");
		System.out.println("Sending ammount to reciver Bank");
	}
}

public class AbstractionExample {
	public static void main(String[] args) {
		//up-casting:- storing child object inside a parent reference.
		Father ref=new Son();//this is the example for upcasting
		ref.fatherMethod();//
		
//		Son son = new Son();
//		son.fatherMethod();
	}
}
