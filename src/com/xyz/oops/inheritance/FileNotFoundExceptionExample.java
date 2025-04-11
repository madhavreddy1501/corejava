package com.xyz.oops.inheritance;

import java.io.*;

public class FileNotFoundExceptionExample {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("./imp/pk.txt");
			System.out.println("completed File Reading");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found in Given Path");
		}
	}
}
