package com.xyz.oops.inheritance;

//import java.lang.

//All classes comes under non primitive data Type example is String 
public class StringExample {
	public static void main(String[] args) {
//		String name1 = new String("Kalyan");
//		System.out.println(name1);//kalyan
		
		String name = "Pavan Madhav";
		System.out.println(name);//pavan
		System.out.println(name.length());//12
		System.out.println(name.charAt(4));//n
		System.out.println(name.contains("van"));//true
		System.out.println(name.toLowerCase());//pavan madhav
		System.out.println(name.toUpperCase());//PAVAN MADHAV
//		Pavan Madhav kalyan
		System.out.println(name.concat(" kalyan"));
		System.out.println(name.substring(6));//Madhav
		System.out.println(name.substring(6,12));//Madha
		String[] names=name.split(" ");
		System.out.println("After spliting first word will store inside an array "+names[0]);//pavan
		System.out.println(names[1]);//n M
		String finalAns=name.join(",", names);
		System.out.println(finalAns);
//		name.length()--> 12
//		for(int x = 0; x<name.length();x++) {
//			System.out.println(name.charAt(x));//0-->10
//		}
		
		for(int x = name.length()-1; x>=0; x--) {
			System.out.println(name.charAt(x));
		}
		
		Runnable runnable = () -> {
			System.out.println();
		};
	}
}
