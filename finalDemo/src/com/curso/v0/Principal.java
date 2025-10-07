package com.curso.v0;

class Ave{
	void volar() {}
	static void comer() {}
}

class Pato extends Ave{
	@Override
	void volar() {}
	//HIDDEN (Ocultar)
	static void comer() {}
}

public class Principal {
	
	public static void main(String[] args) {
		final StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		
		//sb = new StringBuilder("Hola");
		//sb = null;
		//sb = sb.append(" World");
		
		System.out.println(sb);
		
		final String cadena = "hola";
		//cadena = "hello";

	}
	

}
