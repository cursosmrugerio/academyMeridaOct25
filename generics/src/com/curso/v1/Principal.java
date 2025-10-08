package com.curso.v1;

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
		List<Object> list1A = listObjects;
		List<?> list1B = listObjects;
	
		List<String> listString = new ArrayList<>();
		listString.add("Object");
		listString.add("Hello");
		listString.add("Hola");
		listString.add("100");
		//List<Object> list2 = listString; //NO COMPILA
		List<?> list2 = listString; 
		
		List<Figura> listFigura = new ArrayList<>();
		listFigura.add(new Figura());
		listFigura.add(new Circulo());
		listFigura.add(new Cuadrado());
		List<?> list3 = listFigura;
		
		List<Circulo> listCirculo = new ArrayList<>();
		listCirculo.add(new Circulo());
		listCirculo.add(new Circulo());
		listCirculo.add(new Circulo());
		List<?> list4 = listCirculo;
		
		List<Cuadrado> listCuadrado = new ArrayList<>();
		listCuadrado.add(new Cuadrado());
		listCuadrado.add(new Cuadrado());
		listCuadrado.add(new Cuadrado());
		List<?> list5 = listCuadrado;

	}



}
