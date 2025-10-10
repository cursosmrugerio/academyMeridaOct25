package com.curso.v7;

class Pato {
	Object obj; //MONITOR (CANDADO)

	public Pato(Object obj) {
		this.obj = obj;
	}

	void esperar() { 
		synchronized (obj) { // Obtiene el monitor del objeto Object
			System.out.println("Pato espera 5 segundos. Thread: "+Thread.currentThread().getName());
			try {
				obj.wait(5000); // Libera 5 segundos el monitor
				System.out.println("Termina wait Thread: "+Thread.currentThread().getName());
				System.out.println("Pato duerme 5 segundos. Thread: "+Thread.currentThread().getName());
				Thread.sleep(10_000);
				System.out.println("Termina sleep Thread: "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class Principal {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Begin main V7");
		Object o = new Object(); // OBJECTO MONITOR

        Pato pato = new Pato(o);

        Runnable runn = () -> pato.esperar(); //LAMBDA
					
		Thread t1 = new Thread(() -> pato.esperar(),"Hilo1");
		Thread t2 = new Thread(() -> pato.esperar(),"Hilo2");
		Thread t3 = new Thread(runn,"Hilo3");
		
		t1.start();
		t2.start();
		t3.start();
		
//		Pato pato = new Pato(o);
//		pato.esperar();
		
		System.out.println("End main");
	}
}