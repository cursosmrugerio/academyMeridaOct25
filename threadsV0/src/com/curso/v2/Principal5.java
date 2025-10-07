package com.curso.v2;

public class Principal5 {

	// Thread main
	public static void main(String[] args) {
		System.out.println("Inicio Programa"); //main
		
		Runnable run = () -> {
			System.out.println("Proceso........" + Thread.currentThread().getName());
			try {
				Thread.currentThread().sleep(5000); // Dormir 5 seg
				System.out.println("Desperte!!! "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
				
		Thread t1 = new Thread(run);
		t1.setName("Hilo1");
		 
		Thread t2 = new Thread(run);
		t2.setName("Hilo2");
		
		t1.start();
		t2.start(); 
		
		System.out.println("Fin Programa"); //main
	}

}
