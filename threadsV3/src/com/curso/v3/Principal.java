package com.curso.v3;

class Pato{
	Object obj;
	public Pato(Object obj) {
		this.obj = obj;
	}

	void esperar(){
		synchronized(obj) { //OBTENER EL MONITOR DE obj
			System.out.println("Pato espera 5 segundos, "+Thread.currentThread().getName());
			try {
				obj.wait(5000); //ESPERAR hilo main 5 segundos y libera Monitor (Candado)
			} catch (InterruptedException e) {
				System.out.println("Interrumpieron al pato de su espera");
			}
		}
	}
}

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("Inicio Programa V3");
		Object o = new Object(); //PARA OBTENER EL MONITOR (CANDADO)
		new Pato(o).esperar();
		System.out.println("Fin Programa");

	}

}
//4 ACTORES
//Thread : main
//Pato   : esperar()
//Object : Obtiene monitor (candado)
//Recursos compartidos: X