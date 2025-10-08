package com.curso.v6;

class Estudiante{
	
	Estudiante(){
		System.out.println("***Paso por constructor***");
	}
	
	String nombre = "SinNombre";
	static int contador = 0; 
	
	{
		System.out.println("Bloque instancia 1");
	}
	
	static {
		System.out.println("Bloque static 1");
	}
	
	{
		System.out.println("Bloque instancia 2");
	}
	
	static {
		System.out.println("Bloque static 2");
	}
	
	
	
	
}

public class Principal {
	public static void main(String[] args) {
		//ORDEN
		//static: (Atributos static y métodos static)
		//instancia: (Atributos instancia y métodos instancia)
		//constructor
		Estudiante e1 = new Estudiante();
		//Bloque static 1
		//Bloque static 2
		//Bloque instancia 1
		//Bloque instancia 2
		//***Paso por constructor***
		Estudiante e2 = new Estudiante();
		//Bloque instancia 1
		//Bloque instancia 2
		//***Paso por constructor***
	}
}
