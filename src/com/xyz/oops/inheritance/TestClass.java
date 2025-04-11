package com.xyz.oops.inheritance;

import com.xyz.oops.*;
//what is the class for every class which you have created?
// Every Class which Extends Object class By Default

public class TestClass {
	public static void main(String[] args) {
		//super class is Object
		//sub class Room 
//		Object ref=new Room();
//		Object ref1 = new TypeCasting();
//		Object ref2=new String();
		
		try {
			Object[] name = new String[5];
			name[0] = 10;
			name[1] = "Madhav";
		} catch (ArrayStoreException e) {
			System.out.println("You can't store the mismatch values in Array");
		}
		
	}
}
