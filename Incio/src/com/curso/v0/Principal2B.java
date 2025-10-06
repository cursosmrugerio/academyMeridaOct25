package com.curso.v0;

public class Principal2B {

	public static void main(String[] args) {

		int x = 10; //PRIMITIVOS
		String cadena = "Hello"; //INMUTABLE
		StringBuilder sb = new StringBuilder("Hola"); //MUTABLES
		
		cadena = transforma(x,cadena,sb);
		
		System.out.println("x: "+x); //10
		System.out.println("cadena: "+cadena); //Hello World
		System.out.println("sb: "+sb); //Hola Mundo

	}

	private static String transforma(int x, String cadena, StringBuilder sb) {
		
		x = x + 10; //20
		
		cadena = cadena.concat(" World");
		
		sb.append(" Mundo");
		
		return cadena;
		
	}

}
