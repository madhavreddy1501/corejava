package com.xyz.oops.inheritance;

//Example for ArrayIndexOutOfBoundsException
public class ArrayOouOfBoundExceptionExample {
	public static void main(String[] args) {
//		Syntax for Arrays decleration
//		dataType[] refName = new dataType[length];
		System.out.println("Program Started");
		try {
			int[] x = new int[2];
			x[0] = 20;
			x[1] = 30;
			x[2] = 40;
			System.out.println(x[0]);//20
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You can't store the values more than length which you decceler");
		}
		System.out.println("Program Ended");
	}
}
