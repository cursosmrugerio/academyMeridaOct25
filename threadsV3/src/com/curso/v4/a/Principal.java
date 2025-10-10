package com.curso.v4.a;

class Pato implements Runnable {

	synchronized void dormir() {
		System.out.println("Pato espera 5 segundos. Thread: " + Thread.currentThread().getName());
		try {
			this.wait(5000); // Libera 5 segundos el monitor
			System.out.println("Pato termina espera. Thread: "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		dormir();
	}
}

public class Principal {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Begin main V4A");
		Runnable run = new Pato(); //Objeto de donde obtenemos el monitor
		
		new Thread(run, "Hilo1").start();
		new Thread(run, "Hilo2").start();
		((Pato)run).dormir();

		System.out.println("End main");
	}
}

//4 ACTORES
//Threads : main, Hilo1, Hilo2
//Pato   : esperar()
//Instancia Pato : Obtiene monitor (candado)
//Recursos compartidos: X