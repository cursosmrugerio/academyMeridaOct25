package com.curso.v4;

class Pato implements Runnable {

	Object obj; //USAR PARA UN MONITOR EXTERNO

	public Pato(Object obj) {
		this.obj = obj;
	}

	void esperar() { 
		synchronized (obj) { // Obtiene el monitor del objeto Object
			System.out.println("Pato espera 5 segundos. Thread: "+Thread.currentThread().getName());
			try {
				obj.wait(5_000); // Libera 5 segundos el monitor
				//Thread.sleep(5_000); //BLOQUE
				System.out.println("Pato termina espera. Thread: "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		esperar();
	}
}

public class Principal {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Begin main V4"); //Thread main
		Object o = new Object(); // OBJECTO
		Runnable run = new Pato(o); 
				
		new Thread(run,"Hilo1").start(); //Hilo1
		new Thread(run,"Hilo2").start(); //Hilo2
        ((Pato)run).esperar(); //main
		
		System.out.println("End main"); //Thread main
	}
}

//4 ACTORES
//Threads : main, Hilo1, Hilo2
//Pato   : esperar()
//Object : Obtiene monitor (candado)
//Recursos compartidos: X