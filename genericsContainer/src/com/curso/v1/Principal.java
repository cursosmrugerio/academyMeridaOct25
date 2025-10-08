package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		Naranja naranja = new Naranja();
		Mandarina mandarina = new Mandarina();
		Platano platano = new Platano();
		
		Contenedor cp = new Contenedor(platano);
		Contenedor cm = new Contenedor(mandarina);
		Contenedor cn = new Contenedor(naranja);
		
	}

}
