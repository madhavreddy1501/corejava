package com.xyz.oops.inheritance;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
	public static void main(String[] args) {
		FileReader fileReader;
		try {
			System.out.println("Program Started");
			fileReader = new FileReader("./imp/sample.txt");
			try {
				fileReader.read();
				System.out.println("Program Ended");
			} catch (IOException e) {
		
			}
		} catch (FileNotFoundException e) {
			try {
				
			} catch (Exception t) {
				
			}
		}
		
	}
}
