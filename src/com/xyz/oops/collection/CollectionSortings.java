package com.xyz.oops.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class CollectionSortings {
	public static void main(String[] args) {
		TreeSet<Integer> sortSet = new TreeSet<Integer>();
		sortSet.add(10);
		sortSet.add(2);
		sortSet.add(23);
		
		System.out.println(sortSet);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(2);
		arrayList.add(23);
		
		System.out.println(arrayList);
		
//		Step need to do for Sorting the ArrayList
		Collections.sort(arrayList);
		
		System.out.println(arrayList);
	}
}
