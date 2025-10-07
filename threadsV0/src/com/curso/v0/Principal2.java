package com.curso.v0;

class MiHilo extends Thread {
	@Override
	public void run() {
		System.out.println("Proceso........" + Thread.currentThread().getName());
		try {
			Thread.currentThread().sleep(5000); // Dormir 5 seg
			System.out.println("Desperte!!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Principal2 {

	// Thread main
	public static void main(String[] args) {
		System.out.println("Inicio Programa");
		
		//new MiHilo().run(); //main
		
		new MiHilo().start(); //Other Thread 
		
		System.out.println("Fin Programa");
	}

}
