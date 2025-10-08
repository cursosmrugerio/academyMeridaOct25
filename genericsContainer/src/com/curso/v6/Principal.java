package com.curso.v6;

public class Principal {

	public static void main(String[] args) {
		Naranja naranja = new Naranja();
		Mandarina mandarina = new Mandarina();
		Platano platano = new Platano();
		
		Contenedor<Platano> cp = new Contenedor<>(platano);
		Contenedor<Mandarina> cm = new Contenedor<>(mandarina);
		Contenedor<Naranja> cn = new Contenedor<>(naranja);
		
		//cm.setT(new Platano());
		cm.setT(new Mandarina());
		
//		StringBuilder sb = new StringBuilder("Hello");
//		Contenedor<StringBuilder> ssb = new Contenedor<>(sb);
//		StringBuilder otherSb = ssb.getT();
//		System.out.println(otherSb);
		

	}

}
