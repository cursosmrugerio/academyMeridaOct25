package com.curso.v1;

public class Alumno {
	
	//VARIABLE DE INSTANCIA (OBJETO)
	String nombre; //null
	int edad; //0
	
	//VARIABLE DE CLASE 
	static int contador; //0
	
	public Alumno(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}

}
