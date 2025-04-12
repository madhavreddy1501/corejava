package com.xyz.oops.inheritance;

public class InterruptedExceptionExample {
	public static void main(String[] args) {
		System.out.println("Program Strted");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
	
		} finally {
			
		}
		
		System.out.println("Program ended");
	}
}
