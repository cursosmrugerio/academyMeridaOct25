package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		Naranja naranja = new Naranja();
		Mandarina mandarina = new Mandarina();
		Platano platano = new Platano();
		
		Contenedor<Platano> cp = new Contenedor<>(platano);
		Contenedor<Mandarina> cm = new Contenedor<>(mandarina);
		Contenedor<Naranja> cn = new Contenedor<>(naranja);
		
//		mandarina = cp.t;
//		mandarina = cn.t;
		mandarina = cm.t;
		
//		Contenedor<Platano> contenedor = new Contenedor<>(naranja);
		Contenedor<Platano> contenedor = new Contenedor<>(new Platano());
		
		System.out.println(mandarina);
	}

}
