package com.curso.v0;
class Ave {
	void volar() {
		System.out.println("Ave volar");
	}
	
	void volarAve() {
		System.out.println("volarAve()");
	}
}
class Pato extends Ave{
	@Override
	void volar() {
		System.out.println("Pato volar");
	}
	void volarPato() {
		System.out.println("volarPato()");
	}
}
public class Principal3 {

	public static void main(String[] args) {
		Pato pato = new Pato();
		pato.volar(); 
		
		Ave ave = new Pato();
		ave.volar(); //Pato volar
		ave.volarAve();
		//ave.volarPato(); //ERROR
		((Pato)ave).volarPato();
	}

}
