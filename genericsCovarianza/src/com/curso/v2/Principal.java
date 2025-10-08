package com.curso.v2;

import java.util.List;

class A {
	List<? extends Number> getNumero() {
		return null;
	}
}

class B extends A{
	@Override
	List<? extends Integer> getNumero() {
		return null;
	}
}

class C extends B{
	@Override
	List<Integer> getNumero() {
		return null;
	}
}


public class Principal {

	public static void main(String[] args) {
		System.out.println("Inicio");
		C c = new C();
		List<Integer> lista1 = c.getNumero();
		
		A a = new C();
		List<? extends Number> lista2 = a.getNumero();
	}

}
