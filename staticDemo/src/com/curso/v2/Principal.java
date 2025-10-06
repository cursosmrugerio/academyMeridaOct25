package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Alumno.getContador()); //0

		Alumno alumno1 = new Alumno("Patrobas",20);
		Alumno alumno2 = new Alumno("Filologo",18);
		Alumno alumno3 = new Alumno("Epeneto",21);
		Alumno alumno4 = new Alumno("Andronico",22);
		
		System.out.println(alumno1.getContador()); //1 //0 //4
		System.out.println(alumno2.getContador()); //2 //0 //4
		System.out.println(alumno3.getContador()); //3 //0 //4
		System.out.println(alumno4.getContador()); //4 //0 //4
		
		System.out.println(Alumno.getContador()); //4
		
	}

}
