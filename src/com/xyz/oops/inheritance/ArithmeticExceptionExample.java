package com.xyz.oops.inheritance;

//Exception class

//For all Exceptions Throwable class is a super class
//Exception class is the sub class of Throwable
//Under Exception two types 1) Runtime(un-checked) 2)compileTime(checked-Exceptions)

//Example in RuntimeException(un-checked Exception):-
//1)ArithmeticException
public class ArithmeticExceptionExample {
	public static void main(String[] args) {
		System.out.println("Program Started");
		int x = 10;
		try {
			System.out.println(x/0);//
			//new ArithmeticException();
		}catch (Throwable e) {
			System.out.println("Number Can't Divisible By 0");
		}
		System.out.println("Program Ended");
	}
}
