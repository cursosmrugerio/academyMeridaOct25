package com.curso.v7;

class A {
	//ORDEN
	//static: (Atributos static y métodos static)
	//instancia: (Atributos instancia y métodos instancia)
	//constructor
	int a = 5;
	A() { // CONSTRUCTOR
		print(); //EL DE B
	}

	void print() { // METODO DE INSTANCIA
		System.out.print("A ");
	}
}

public class B extends A {
	int i = 4; // VARIABLE DE INSTANCIA
	
	public static void main(String[] args){
		A a = new B(); //0_
		//a.print(); //4_
	}

	@Override
	void print() {
		System.out.print(i + " "); //0
		System.out.print(a + " "); //5
	}

}
