package com.xyz.oops.collection;

import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add("Pavan");
		arrayList.add('A');
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(20);
		System.out.println(arrayList.size());//4
		System.out.println(arrayList.get(2));//Pavan
		System.out.println(arrayList.contains("Pava"));//true
		System.out.println("Before Remove Method "+ arrayList);
		arrayList.remove(2);
		System.out.println("After Remove Method "+ arrayList);
		
		System.out.println(arrayList);
		System.out.println(arrayList.indexOf('A'));
		System.out.println(arrayList.lastIndexOf(20));
		
		ArrayList arrayList2 = new ArrayList();
		arrayList2.add(20);
		arrayList2.add(30);
		arrayList2.add(20);
		
		arrayList.addAll(arrayList2);
		System.out.println(arrayList);
		
		arrayList.removeAll(arrayList2);
		System.out.println(arrayList);
	}
}
