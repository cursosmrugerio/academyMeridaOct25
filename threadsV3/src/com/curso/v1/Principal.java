package com.curso.v1;

class Pato{
	
	void esperar(){ //QUIEN ESPERA ES EL HILO main
                    //DE DONDE PUEDO OBTENER EL CANDADO
                    //ES DE LA INSTANCIA DEL PATO (this)
		System.out.println("Pato espera 5 segundos, "+Thread.currentThread().getName());
		try {
			wait(5000); //ESPERA EL HILO main 5 segundos
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
