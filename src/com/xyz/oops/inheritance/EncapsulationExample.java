package com.xyz.oops.inheritance;

//Step We have create a class
//step we have to decclere the variables with private access modifier
//create a getters method to get the value
//create the setters method to set the values

class Tablet {
	private int power;
	private String name;
	
	//we have create getters and setters methods
	
	//getters are always return type methods
	public int getPower() {
		return power;
	}
	
	public String getName() {
		return name;
	}
	
	//setters are always non return type methods
	public void setPower(int x) {
		power = x ;
	}
	public void setName(String y) {
		name = y;
	}
}


public class EncapsulationExample {
	public static void main(String[] args) {
		Tablet tablet = new Tablet();
		System.out.println(tablet.getPower());//0
		System.out.println(tablet.getName());//null
		tablet.setPower(200);
		System.out.println(tablet.getPower());//20
		tablet.setName("Madhav");
		System.out.println(tablet.getName());
	}
}
