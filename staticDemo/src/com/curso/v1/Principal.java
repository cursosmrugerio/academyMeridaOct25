package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Alumno.contador); //0

		Alumno alumno1 = new Alumno("Patrobas",20);
		Alumno alumno2 = new Alumno("Filologo",18);
		Alumno alumno3 = new Alumno("Epeneto",21);
		Alumno alumno4 = new Alumno("Andronico",22);
		
		System.out.println(alumno1.contador); //1 //0 //4
		System.out.println(alumno2.contador); //2 //0 //4
		System.out.println(alumno3.contador); //3 //0 //4
		System.out.println(alumno4.contador); //4 //0 //4
		
		System.out.println(Alumno.contador); //4
		
		
	}

}
