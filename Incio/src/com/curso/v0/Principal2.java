package com.curso.v0;

public class Principal2 {

	public static void main(String[] args) {

		int x = 10; //PRIMITIVOS
		String cadena = "Hello"; //INMUTABLE
		StringBuilder sb = new StringBuilder("Hola"); //MUTABLES
		
		transforma(x,cadena,sb);
		
		System.out.println("x: "+x); //10
		System.out.println("cadena: "+cadena); //Hello
		System.out.println("sb: "+sb); //Hola Mundo

	}

	private static void transforma(int x, String cadena, StringBuilder sb) {
		
		x = x + 10; //20
		
		cadena.concat(" World");
		
		sb.append(" Mundo");
		
	}

}
