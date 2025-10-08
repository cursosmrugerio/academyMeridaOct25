package com.curso.v5;

public class TestClass {
	public void method(Object o) { // SuperClase (Abuelo)
		System.out.println("Object Version");
	}

	public void method(java.io.FileNotFoundException s) { // Subclase (Nieto)
		System.out.println("java.io.FileNotFoundException Version");
	}

	public void method(java.io.IOException s) { // Clase (Padre)
		System.out.println("IOException Version");
	}

//	public void method(String s) { // Clase (Padre)
//		System.out.println("String Version");
//	}

	public static void main(String args[]) {
		TestClass tc = new TestClass();
		tc.method(null); 
	}
}