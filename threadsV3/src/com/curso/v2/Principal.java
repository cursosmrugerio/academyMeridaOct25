package com.curso.v2;

class Pato{
	
	synchronized void esperar(){
		System.out.println("Pato espera 5 segundos, "+Thread.currentThread().getName());
		try {
			wait(5000); //ESPERAR hilo main 5 segundos y libera Monitor (Candado)
		} catch (InterruptedException e) {
			System.out.println("Interrumpieron al pato de su espera");
		}
	}
}

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("Inicio Programa");
		new Pato().esperar();
		System.out.println("Fin Programa");

	}

}
