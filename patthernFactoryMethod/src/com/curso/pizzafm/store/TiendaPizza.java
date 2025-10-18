package com.curso.pizzafm.store;

import com.curso.pizzafm.Pizza;

public abstract class TiendaPizza {

    //FACTORY METHOD
	abstract Pizza crearPizza(String tipo);

    //ASEGURO QUE TODAS LAS TIENDAS SIGAN EL MISMO PROCESO
	final public Pizza ordenarPizza(String tipo) {
		Pizza pizza = crearPizza(tipo); //ES LA SUBCLASE QUIEN DECIDE COMO crearPizza
		System.out.println("--- Haciendo una " + pizza.getNombre() + " ---");
		pizza.preparar();
		pizza.hornear();
		pizza.cortar();
		pizza.empaquetar();
		return pizza;
	}
}
