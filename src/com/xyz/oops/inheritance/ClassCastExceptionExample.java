package com.xyz.oops.inheritance;


//Example for ClassCast Exception

//Casting of Object 


//Two Types Casting 1) up-casting 2) Down Casting

//1)Up-casting:- Storing Subclass Object inside a Super class Reference

//2)DownCasting: - Storing Super class Object inside a SubClass reference

//Note:- Before DownCasting we should do Up-casting with that object we have to do down cast
class SuperClass {
	
}

class SubClass extends SuperClass{
	
}
public class ClassCastExceptionExample {
	public static void main(String[] args) {
		System.out.println("Program Started");
		//Up-casting
//		SuperClass refObject=(SuperClass)new SubClass();
		
		try {
			//Down-casting
			SubClass ref=(SubClass)new SuperClass();
		} catch(ClassCastException e) {
			System.out.println("Before Down Cast please do Upcasting compulsory");
		}
		System.out.println("Program Ended");
	}
}
