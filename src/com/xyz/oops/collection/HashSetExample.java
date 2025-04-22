package com.xyz.oops.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetExample {
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(12);
		arrayList.add("Pavan");
		arrayList.add('A');
		arrayList.add(true);
		System.out.println("Array List: -"+arrayList);
		arrayList.add(1, "Kalayn");
		System.out.println("Array List: -"+arrayList);
		
		HashSet hasSet= new HashSet();
		hasSet.add(12);
		hasSet.add("Pavan");
		hasSet.add('A');
		hasSet.add(true);
		System.out.println("HashSet: -"+hasSet);
				
		//Initial Storage 0
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		linkedHashSet.add(12);
		linkedHashSet.add("Pavan");
		linkedHashSet.add('A');
		linkedHashSet.add(true);
		System.out.println("LinkedHashSet: -"+linkedHashSet);
		
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Pavan");
		treeSet.add("Kalayn");
		treeSet.add("Madhav");
		treeSet.add("Vivek");
		treeSet.add("Vikas");
		
		System.out.println("Tree Set: -"+treeSet);
	}
}
