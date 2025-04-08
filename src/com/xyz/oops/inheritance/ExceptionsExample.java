package com.xyz.oops.inheritance;


//What is an exception..?
//how to handle exceptions
//you have deal try and catch block.

//Sytax:-
// try {

//} catch (Exception class) {

//} finally {

//}

public class ExceptionsExample {
	public static void main(String[] args) {
		System.out.println("Program Started");
		
		int x = 10;
		//Division Operation
		try {
			System.out.println(x / 0);//
			//new ArithmeticException();
		} catch (ArithmeticException refName) {
			System.out.println("You can't Divisble any number with Zero");//
		} finally {
			//close the DB
			System.out.println("Finally block Excute");
		}
		
		System.out.println("Program Ended");//
	}
}
