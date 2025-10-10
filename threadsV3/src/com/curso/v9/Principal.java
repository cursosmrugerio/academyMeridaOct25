package com.curso.v9;

class Pato {
	Object obj;
	public Pato(Object obj) {
		this.obj = obj;
	}

	void esperar() { 
		synchronized (obj) {
			System.out.println("Pato espera 100 segundos. Thread: "+Thread.currentThread().getName());
			try {
				obj.wait(100_000);
				System.out.println("Termina wait Thread sin esperar 100 seg.: "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				System.out.println("***INTERRUMPIR***");
				e.printStackTrace();
			}
		}
	}
}

public class Principal {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Begin main V9");
		Object obj = new Object();
        Pato pato = new Pato(obj);
					
		Thread t1 = new Thread(() -> pato.esperar(),"Hilo1");
        Thread t2 = new Thread(() -> pato.esperar(),"Hilo2");
        Thread t3 = new Thread(() -> pato.esperar(),"Hilo3");

		t1.start();
        t2.start();
        t3.start();

		Thread.sleep(5_000);

        synchronized (obj) {
			obj.notifyAll();
        }
		
		System.out.println("End main");
	}
}