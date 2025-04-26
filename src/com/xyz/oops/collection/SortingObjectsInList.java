package com.xyz.oops.collection;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	int empId;
	String empName;
	
//	constructor Which is used to Intialize the Variables
	public Employee(int id,String name) {
		empId = id;
		empName = name;
	}
	
	public String toString() {
		return "empId: "+empId+ " empName: "+empName;
	}
	
	public int compareTo(Employee object) {
		return Integer.compare(empId, object.empId);
	}
}

public class SortingObjectsInList {
	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		
		Employee employee3 = new Employee(123, "Vivek");
		Employee employee1 = new Employee(122, "Madhav");
		Employee employee2 = new Employee(121, "Pavan");
		
		
		arrayList.add(employee1);
		arrayList.add(employee2);
		arrayList.add(employee3);
		
		System.out.println(arrayList);
		
		Collections.sort(arrayList);
		
		System.out.println(arrayList);
	}
}
