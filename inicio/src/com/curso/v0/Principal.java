package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		String s1 = "Hello"; //Pool String
		String s2 = "Hello";
		String s3 = "Hello";
		String s4 = new String("Hello");
		
		//Objetos ?? 2
		//100 % Orientado a Objetos V7 ? NO, por los PRIMITIVOS
		
		System.out.println("s1.equals(s4): "+s1.equals(s4)); //true
		
		StringBuilder sb1 = new StringBuilder("Hola");
		StringBuilder sb2 = new StringBuilder("Hola");
		StringBuilder sb3 = sb1;

		System.out.println(sb1.equals(sb2)); //false
		System.out.println(sb1.equals(sb3)); //true


		
	}

}
