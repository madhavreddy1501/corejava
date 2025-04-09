package com.xyz.oops.inheritance;

//Example for Null pointer Exception
public class NullpointerExceptionExample {
	public static void main(String[] args) {
		System.out.println("Program started");
		String name = null;
		try {
			System.out.println(name.toLowerCase());
			//new NullPointerException()
		} catch (NullPointerException e) {
			System.out.println("You can't do operation with null");
		}
		System.out.println("Program Ended");
	}
}
