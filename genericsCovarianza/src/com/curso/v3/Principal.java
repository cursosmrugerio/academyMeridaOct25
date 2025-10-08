package com.curso.v3;

import java.util.List;

class A {
	List<? super Integer> getNumero() {
		return null;
	}
}

class B extends A{
	@Override
	List<? super Number> getNumero() {
		return null;
	}
}

class C extends B{
	@Override
	List<Number> getNumero() {
		return null;
	}
}


public class Principal {

	public static void main(String[] args) {
		System.out.println("Inicio");
		C c = new C();
		List<Number> lista1 = c.getNumero();
		
		A a = new C();
		List<? super Integer> lista2 = a.getNumero();
	}

}
