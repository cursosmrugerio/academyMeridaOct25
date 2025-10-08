package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		Naranja naranja = new Naranja();
		Mandarina mandarina = new Mandarina();
		Platano platano = new Platano();
		
		ContenedorPlatano cp = new ContenedorPlatano(platano);
		ContenedorMandarina cm = new ContenedorMandarina(mandarina);
		ContenedorNaranja cn = new ContenedorNaranja(naranja);
	}

}
