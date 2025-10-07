package com.curso.v1;

class Pato{
	
	void esperar(){
		System.out.println("Pato duerme 5 segundos, "+Thread.currentThread().getName());
		try {
			wait(5000); //BLOQUEAR AL HILO main 5 segundos
			//Exception in thread "main" java.lang.IllegalMonitorStateException: current thread is not owner
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
