package com.xyz.oops.inheritance;

//create two class
//given relation one to another class
//we have to create non static method inside a parent class
//we have override the method inside a child class

// method decclere should be same in child class

class Parent {
	int x = 20;
	//non static method
	void parentMethod() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent{
//	int x = 20;
	int x = 30;
	
	@Override
	void parentMethod() {
		System.out.println("Child method");
	}
}


public class MethodOverrideExample {
	public static void main(String[] args) {
		Child child = new Child();
		child.parentMethod();
	}
}
