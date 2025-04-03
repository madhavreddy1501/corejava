package com.xyz.oops.inheritance;

class NormalClass {
	
	//only body methods allow
	void normalMethod(){
		
	}
}

abstract class AbstarctClassExample {
	//allows both body methods as well as non body(abstract) methods
	
	void normalMethod() {
		
	}
	
	//abstract method we have to decclere the abstract key word
	abstract void nonBodyMethod();
}

interface InterfaceExample {
	//only abstract methods allow
	//by default JVM can specifiy the public and abstract key words for the methods
	void nonBodyMethod();
}


public class DiffClassAbstarctClassInterface {

}
