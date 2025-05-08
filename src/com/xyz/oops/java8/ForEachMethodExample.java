package com.xyz.oops.java8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachMethodExample {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(10);
		arrayList.add(12);
		arrayList.add(14);
		arrayList.add(16);
		
		System.out.println(arrayList);//
		
		//for each loop
//		for(int ref:arrayList) {
//			System.out.println(ref);
//		}
		
		Consumer<Integer> consumerObject = (t) -> {
			System.out.println(t);
		};
		
		
		arrayList.forEach(consumerObject);
	}
}
