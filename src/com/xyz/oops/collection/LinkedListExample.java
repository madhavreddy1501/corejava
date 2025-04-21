package com.xyz.oops.collection;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		
//		Best for data Manipulation
		LinkedList linkedList = new LinkedList();
		linkedList.add(new Integer(10));
		linkedList.add(new String("Pavan"));
		linkedList.add(new Boolean(true));
		linkedList.add(new Character('A'));
		
		System.out.println(linkedList);
		
		linkedList.add(1, "Kalyan");
		System.out.println(linkedList);
		System.out.println(linkedList.get(1));
		
		for(Object x:linkedList) {
			System.out.println(x);
		}
		
		
//		Which is stored in shift mechanism
//		Best For Retrivel purpose
		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add("Pavan");
		arrayList.add(true);
		arrayList.add('A');
		
		System.out.println(arrayList);//
		arrayList.add(1, "Kalayn");
		System.out.println(arrayList);
		System.out.println(arrayList.get(0));
		
//		best for Threads Impl
		Vector vector = new Vector();
		vector.add(10);
		
		System.out.println(vector.get(0));//10
		
		
//		Last In first Out - LIFO
		Stack stack = new Stack();
		stack.add(10);
		stack.add("Pavan");
		stack.add(true);
		stack.add('A');
		System.out.println(stack);
		System.out.println(stack.pop());//A
		System.out.println(stack);
		
		for(Object ref: stack) {
			System.out.println(ref);
		}
	}
}
