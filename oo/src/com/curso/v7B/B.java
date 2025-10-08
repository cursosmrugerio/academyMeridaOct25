package com.curso.v7B;

class A {
	A() { 
		print(); 
	}

	void print() { 
		System.out.print("A ");
	}
}

public class B extends A {
	int i = 4; 
	
	public static void main(String[] args){
		A a = new B(); 
		a.print(); 
	}

	@Override
	void print() {
		System.out.print(i + " "); 
	}
}
