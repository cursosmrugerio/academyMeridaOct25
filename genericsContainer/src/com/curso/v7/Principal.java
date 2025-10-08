package com.curso.v7;

public class Principal {

	public static void main(String[] args) {
		Naranja naranja = new Naranja();
		Mandarina mandarina = new Mandarina();
		Platano platano = new Platano();
		
		Contenedor<Platano> cp = new Contenedor<>(platano);
		Contenedor<Mandarina> cm = new Contenedor<>(mandarina);
		Contenedor<Naranja> cn = new Contenedor<>(naranja);
		
		cm.showCodigo("abc");
		cp.showCodigo(new StringBuilder("XYZ"));
		cn.showCodigo(Double.valueOf(12.34));
		
//		cm.<String>showCodigo("abc");
//		cp.<StringBuilder>showCodigo(new StringBuilder("XYZ"));
//		cn.<Double>showCodigo(Double.valueOf(12.34));
	}

}
