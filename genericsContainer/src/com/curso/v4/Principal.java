package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		Naranja naranja = new Naranja();
		Mandarina mandarina = new Mandarina();
		Platano platano = new Platano();
		
		Contenedor<Platano> cp = new Contenedor<>();
		cp.setT(platano);
		Contenedor<Mandarina> cm = new Contenedor<>();
		cm.setT(mandarina);
		Contenedor<Naranja> cn = new Contenedor<>();
		cn.setT(naranja);
		
		naranja = cn.getT();
		mandarina = cm.getT();
		
		System.out.println(mandarina);
		
		Contenedor<Naranja> cn2 = new Contenedor<>();
		naranja = cn2.getT();
		System.out.println(naranja); //null
	}

}
