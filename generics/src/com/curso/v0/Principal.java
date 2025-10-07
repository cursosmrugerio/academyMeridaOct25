package com.curso.v0;

import java.util.*;

class Figura{}
class Circulo extends Figura{}
class Cuadrado extends Figura{}

public class Principal {
	public static void main(String[] args) {
		List<Object> listObjects = new ArrayList<>();
		listObjects.add(new Object());
		listObjects.add("Hello");
		listObjects.add(new StringBuilder("Hola"));
		listObjects.add(Integer.valueOf(100));
		listObjects.add(new Figura());
		listObjects.add(new Circulo());
		listObjects.add(new Cuadrado());
		//showObjects(listObjects); //SI COMPILA
		showUnbunded(listObjects); //SI COMPILA
		
		List<String> listString = new ArrayList<>();
		listString.add("Object");
		listString.add("Hello");
		listString.add("Hola");
		listString.add("100");
		//showObjects(listString); //NO COMPILA
		showUnbunded(listString); //SI COMPILA
		
		List<Figura> listFigura = new ArrayList<>();
		listFigura.add(new Figura());
		listFigura.add(new Circulo());
		listFigura.add(new Cuadrado());
		//showObjects(listFigura); //NO COMPILA
		showUnbunded(listFigura); //SI COMPILA
		
		List<Circulo> listCirculo = new ArrayList<>();
		listCirculo.add(new Circulo());
		listCirculo.add(new Circulo());
		listCirculo.add(new Circulo());
		//showObjects(listCirculo); //NO COMPILA
		showUnbunded(listCirculo); //SI COMPILA
		
		List<Cuadrado> listCuadrado = new ArrayList<>();
		listCuadrado.add(new Cuadrado());
		listCuadrado.add(new Cuadrado());
		listCuadrado.add(new Cuadrado());
		//showObjects(listFigura); //NO COMPILA
		showUnbunded(listCuadrado); //SI COMPILA

	}

	private static void showObjects(List<Object> listObjects) {
		for (Object o:listObjects)
			System.out.println(o.getClass().getSimpleName());
	}
	
	//Unbounded Wildcard ?  //Solo Lectura
	private static void showUnbunded(List<?> listObjects) {
		for (Object o:listObjects) {
			//listObjects.add(new Object()); //Solo Lectura 

			System.out.println(o.getClass().getSimpleName());
			
			if (o instanceof String) {
				o = ((String)o).concat("*");
				System.out.println(o);
			}
		}
		System.out.println("************");
	}
	

}
