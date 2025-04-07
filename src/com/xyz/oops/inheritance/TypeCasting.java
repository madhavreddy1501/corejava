package com.xyz.oops.inheritance;

class Animal {
	void animalName() {
		System.out.println("Animal Name: ");
	}
}

class Tiger extends Animal{
	
	void speedOfTiger() {
		System.out.println("145Kmph");
	}
	
}


public class TypeCasting {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalName();//
		
		Tiger tiger = new Tiger();
		tiger.animalName();//
		tiger.speedOfTiger();//
		
//		Type Casting 1) Up-casting 2) down casting
//		Up-casting is nothing but Storing sub class Object inside the Super class Reference
		Animal refObject=(Animal)new Tiger();//object
		refObject.animalName();
		
//		Down Casting :
//		Note: whenever doing down casting we have to up-casting first.
		Tiger tigerRef=(Tiger)refObject;
		tigerRef.animalName();
		tigerRef.speedOfTiger();
	}
}
