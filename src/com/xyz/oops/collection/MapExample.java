package com.xyz.oops.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		
		//Which doesn't insertion order
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("Hello", "Majji");
		hashMap.put("Hi", "Majji");
		hashMap.put("Bye", "Majji");
		hashMap.put("Morning", "Majji");
		hashMap.put("Night", "Majji");
		hashMap.put("Day", "Majji");
		hashMap.put("week", "Majji");
		
		System.out.println(hashMap);
		
//		Which Maintains insertion order
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
		linkedHashMap.put("Hello", "Majji");
		linkedHashMap.put("Hi", "Majji");
		linkedHashMap.put("Bye", "Majji");
		linkedHashMap.put("Morning", "Majji");
		linkedHashMap.put("Night", "Majji");
		linkedHashMap.put("Day", "Majji");
		linkedHashMap.put("week", "Majji");
		
		System.out.println(linkedHashMap);
		
		//Sorting Technique
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(10, "Sachin");
		treeMap.put(7, "Dhoni");
		treeMap.put(18, "Kohli");
		treeMap.put(45, "Rohit Sharma");
		treeMap.put(97, "Bhumrha");
		
		System.out.println(treeMap);
		
		
	}
}
