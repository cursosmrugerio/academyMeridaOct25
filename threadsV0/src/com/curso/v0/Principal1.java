package com.curso.v0;

public class Principal1 {

	//Thread main
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Inicio Programa");
		
		System.out.println("Proceso......."+ Thread.currentThread().getName());
		Thread.currentThread().sleep(5000); //Dormir 5 seg
		
		System.out.println("Fin Programa");
	}

}
