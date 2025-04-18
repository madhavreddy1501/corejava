package com.xyz.oops.collection;

import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
//		ArrayList arrayList = new ArrayList();
//		arrayList.add(10);
//		arrayList.add(20);
//		arrayList.add("Pavan");
//		arrayList.add('A');
//		arrayList.add(20);
//		arrayList.add(30);
//		arrayList.add(20);
//		System.out.println(arrayList.size());//4
//		System.out.println(arrayList.get(2));//Pavan
//		System.out.println(arrayList.contains("Pava"));//true
//		System.out.println("Before Remove Method "+ arrayList);
//		arrayList.remove(2);
//		System.out.println("After Remove Method "+ arrayList);
//		
//		System.out.println(arrayList);
//		System.out.println(arrayList.indexOf('A'));
//		System.out.println(arrayList.lastIndexOf(20));
//		
//		ArrayList arrayList2 = new ArrayList();
//		arrayList2.add(20);
//		arrayList2.add(30);
//		arrayList2.add(20);
//			
//		arrayList.addAll(arrayList2);
//		System.out.println(arrayList);
//		
//		arrayList.removeAll(arrayList2);
//		System.out.println(arrayList);
		
		ArrayList<Object> list3 = new ArrayList();
		list3.add(20);
		list3.add(30);
		list3.add(20);
		list3.add(40);
		list3.add('A');
		list3.add("Pavan");
		
//		System.out.println(list3);
//		System.out.println("Length Of the Array List: -"+list3.size());//5
//		
//		System.out.println("Forward Direction");
//		
//		for(int x = 0; x<list3.size(); x++) {
//			System.out.println(list3.get(x));
//		}
//		
//		System.out.println("Reverse Direction");
//		for(int x = list3.size()-1; x>=0; x-- ) {
//			System.out.println(list3.get(x));
//		}
//		
//		
//		System.out.println("Reverse Direction Using While Loop");
//		System.out.println();
//		
//		int x = list3.size()-1;
//		while(x>=0) {
//			System.out.println(list3.get(x));;
//			x--;
//		}
//		
//		System.out.println("Forward Direction Using While Loop");
//		System.out.println();
//		
//		int z = 0;
//		while(z<list3.size()) {
//			System.out.println(list3.get(z));
//			z++;
//		}
//		
//		int y = 0;
//		do {
//			System.out.println(list3.get(y));
//			y++;
//		} while(y<list3.size());
		
//		forEach loop 
		for(Object ref: list3) {
			System.out.println(ref);
		}
	}
}
