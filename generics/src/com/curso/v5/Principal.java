package com.curso.v5;

import java.util.*;

class Figura {
	double calcularArea() {
		return 5.0;
	}
}

class Circulo extends Figura {
	double calcularArea() {
		return 10.0;
	}
}

class Cuadrado extends Figura {
	double calcularArea() {
		return 15.0;
	}
}

public class Principal {
	public static void main(String[] args) {
		System.out.println("V5");
		
		List<Object> listObjects = new ArrayList<>();
		listObjects.add(new Object());
		listObjects.add("Hello");
		listObjects.add(new StringBuilder("Hola"));
		listObjects.add(Integer.valueOf(100));
		listObjects.add(new Figura());
		listObjects.add(new Circulo());
		listObjects.add(new Cuadrado());
		showObject(listObjects);

		List<String> listString = new ArrayList<>();
		listString.add("Object");
		listString.add("Hello");
		listString.add("Hola");
		listString.add("100");
		//showObject(listString);

		List<Figura> listFigura = new ArrayList<>();
		listFigura.add(new Figura());
		listFigura.add(new Circulo());
		listFigura.add(new Cuadrado());
		showObject(listFigura);

		List<Circulo> listCirculo = new ArrayList<>();
		listCirculo.add(new Circulo());
		listCirculo.add(new Circulo());
		listCirculo.add(new Circulo());
		//showObject(listCirculo);

		List<Cuadrado> listCuadrado = new ArrayList<>();
		listCuadrado.add(new Cuadrado());
		listCuadrado.add(new Cuadrado());
		listCuadrado.add(new Cuadrado());
		//showObject(listCuadrado);

	}

	static void showObject(List<? super Figura> listaFigura) {
		
		//SE PUEDEN INSERTAR ELEMENTOS
		listaFigura.add(new Figura()); //Figura
		listaFigura.add(new Circulo());//SI Subclase Figura
		//listaFigura.add(new Object());//NO Superclase Figura
		
		for (Object f : listaFigura) {
			System.out.println(f.getClass().getName());
			if (f instanceof Figura)
				System.out.println(((Figura)f).calcularArea());
		}
	}

}
