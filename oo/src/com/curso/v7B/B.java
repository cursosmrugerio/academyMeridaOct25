package com.curso.v7B;

class A {
	A() { 
		print(); //EL DE B
	}

	void print() { 
		System.out.print("A ");
	}
}

public class B extends A {
	final int i = 4; 
	
	public static void main(String[] args){
		A a = new B(); 
		a.print(); 
	}

	@Override
	void print() {
		System.out.print(i + " "); 
	}
}
