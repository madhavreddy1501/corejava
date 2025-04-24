package com.xyz.oops;

class Student {
	//Constructor which is used intilaze the variables
//	2 variables
	int rollNo;//0
	
	String studentName;//null
	
	//Syntax for constructor
	public Student(int roll,String name) {
		rollNo = roll;
		studentName = name;
	}
		
	void methodName() {
		System.out.println("Hlo Hi ");
	}
}

public class ConstructorExample {
	public static void main(String[] args) {
		Student student1 = new Student(1, "Pavan");
		System.out.println(student1.studentName);//pavan
		System.out.println(student1.rollNo);//1
		
		Student student2 = new Student(2, "Madhav");
		System.out.println(student2.studentName);//Madhav
		System.out.println(student2.rollNo);//2
	}
}
