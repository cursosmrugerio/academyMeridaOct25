package com.curso.v1;

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

public class Principal3 {

	// Thread main
	public static void main(String[] args) {
		System.out.println("Inicio Programa");
				
		Thread t1 = new MiHilo();
		t1.setName("Hilo1");
		t1.start(); 
		
		System.out.println("Fin Programa");
	}

}
