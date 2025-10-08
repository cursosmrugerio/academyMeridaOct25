package com.curso.v6;

class A {
	A() { // CONSTRUCTOR
		print(); //EL DE B
	}

	void print() { // METODO DE INSTANCIA
		System.out.print("A ");
	}
}

public class B extends A {
	int i = 4; // VARIABLE DE INSTANCIA
	
//	B(){
//		super(); //INVOCANDO AL CONTRUCTOR DE A
//	}
	
	public static void main(String[] args){
		//A a = new A();  //A
//		B b = new B(); //0_ 
//		b.print(); //4_
		
		A a = new B(); //0_
		a.print(); //4_
		
		//0 4 
	}

	@Override
	void print() {
		System.out.print(i + " ");
	}

}
