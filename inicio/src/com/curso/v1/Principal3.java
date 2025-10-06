package com.curso.v1;
class Ave{
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
		pato.volarPato(); 
		pato.volarAve();
		
		System.out.println("*****");
		
		Ave ave = new Pato();
		ave.volar(); 
		//ave.volarPato(); 
		ave.volarAve();
		
		System.out.println("*****");
		
		Object obj = new Pato();
		((Ave)obj).volar(); 
		((Pato)obj).volarPato(); 
		((Ave)obj).volarAve();
		
	}

}
