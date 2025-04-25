package com.xyz.oops.collection;

import java.util.ArrayList;

class Student {
	
//	Variables
	int rollNo;
	String name;
	
//	Constructor Which is used to Variables
	public Student(int number,String studentName) {
		rollNo = number;
		name = studentName;
	}
	
//	ToString Method Which is used to override the full qualified Address.
	@Override
	public String toString() {
		return "Student RollNumber: "+rollNo+" StudentName: "+name;
	}
}

public class ListWithStudentObject {
	public static void main(String[] args) {
//		we can store only Student Objects inside ArrayList
		ArrayList<Student> arrayList = new ArrayList<Student>();
		
		Student student1 = new Student(420, "Pavan");
		Student student2 = new Student(421, "Vivek");
		Student student3 = new Student(422, "Madhav");
		
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		
		System.out.println(arrayList);
		
//		ForEach Loop
		for(Student  ref: arrayList) {
			System.out.println(ref);//
		}
		
		
	}
}
