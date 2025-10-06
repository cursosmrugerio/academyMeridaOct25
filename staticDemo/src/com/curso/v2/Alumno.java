package com.curso.v2;

public class Alumno {
	
	//VARIABLE DE INSTANCIA (OBJETO)
	private String nombre; //null
	private int edad; //0
	
	//VARIABLE DE CLASE 
	private static int contador; //0
	
	public Alumno(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}

	//PERTENECE A LA CLASE
	public static int getContador() {
		return contador;
	}
	

}
