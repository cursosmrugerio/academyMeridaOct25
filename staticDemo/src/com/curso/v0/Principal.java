package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Alumno alumno1 = new Alumno("Patrobas",20);
		Alumno alumno2 = new Alumno("Filologo",18);
		Alumno alumno3 = new Alumno("Epeneto",21);
		Alumno alumno4 = new Alumno("Andronico",22);
		
		System.out.println(alumno1.contador); //1
		System.out.println(alumno2.contador); //1
		System.out.println(alumno3.contador); //1
		System.out.println(alumno4.contador); //1
		
		System.out.println(alumno1.nombre); 
		System.out.println(alumno2.nombre); 
		System.out.println(alumno3.nombre); 
		System.out.println(alumno4.nombre); 
		

		
		
	}

}
