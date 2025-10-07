package com.curso.v1;

public class TestClass {

	void probe(Integer x) {
		System.out.println("In Integer");
	} 

	void probe(Long x) {
		System.out.println("In Long");
	} 
	
//	void probe(double... x) {
//		System.out.println("In varargs");
//	} 
	
//	void probe(Object x) {
//		System.out.println("In Object");
//	} 
	
	void probe(Number x) {
		System.out.println("In Number"); //<==
	}
	
//	void probe(Double x) {
//		System.out.println("In Double");
//	} 
	
//	void probe(double x) {
//		System.out.println("In double");
//	} 
	
	public static void main(String... args) {
		double a = 10;
		new TestClass().probe(a); 
	}

}
