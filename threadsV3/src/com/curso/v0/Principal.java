package com.curso.v0;

class Pato{
	
	void dormir(){
		System.out.println("Pato duerme 5 segundos, "+Thread.currentThread().getName());
		try {
			Thread.sleep(5000); //BLOQUEAR AL HILO main 5 segundos
		} catch (InterruptedException e) {
			System.out.println("Interrumpieron al pato de su sueño");
		}
	}
}

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("Inicio Programa");
		new Pato().dormir();
		System.out.println("Fin Programa");

	}

}
