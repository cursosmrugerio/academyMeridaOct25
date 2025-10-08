package com.curso.v10;

class Ave {
	void volarAve(){
		System.out.println("Volar Ave");
	}
}

class Pato extends Ave {
	void volarPato(){
		System.out.println("Volar Pato");
	}
}

public class Principal {
	
	public static void main(String...strings ) {
		Ave ave = new Pato(); //BUENA PRACTICA OO
		((Pato)ave).volarPato();
	}

}
