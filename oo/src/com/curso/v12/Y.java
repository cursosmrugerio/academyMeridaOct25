package com.curso.v12;

class A {}

class B extends A {}

class C extends B {}

class X {
	B getB() { //default
		return new B();
	}
}

class Y extends X {
	@Override
	//protected B getB(){ return new C(); }
	C getB(){ return new C(); } //COVARIANZA
	
	
	//public String ejecuta() {return new Object();}
	//public C getB(){ return new B(); } 
	//A getB(){ return new A(); } 
}