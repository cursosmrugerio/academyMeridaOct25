package com.curso.v6;

class Pato implements Runnable {
	Object obj;
	public Pato(Object obj) {
		this.obj = obj;
	}

	void esperar() { 
		synchronized (obj) { // Obtiene el monitor del objeto Object
			System.out.println("Pato espera 5 segundos. Thread: "+Thread.currentThread().getName());
			try {
				obj.wait(10_000); // Libera 5 segundos el monitor
				System.out.println("Termino Thread: "+Thread.currentThread().getName());
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
		System.out.println("Begin main V6");
		Object o = new Object(); // OBJECTO DEL MONITOR
				
		Runnable runn = new Pato(o);

		Thread t1 = new Thread(runn,"Hilo1");
		Thread t2 = new Thread(runn,"Hilo2");
		Thread t3 = new Thread(runn,"Hilo3");
		
		t1.start();
		t2.start();
		t3.start();
		
		Pato pato = new Pato(o); //Thread main
		pato.esperar();

		t1.join(); //Thread main: espera a que el Hilo1 termine
		t2.join(); //Thread main: espera a que el Hilo2 termine
		t3.join(); //Thread main: espera a que el Hilo3 termine
		
		System.out.println("End main"); //ULTIMO MENSAJE EN APARECER
	}
}