package com.curso.factory;

import com.curso.pizzas.Pizza;

public class TiendaPizza {

	public Pizza orderPizza(String tipo) {
		
		Pizza pizza = SimpleFactoryPizza.crearPizza(tipo);
 
		pizza.preparar();
		pizza.hornear();
		pizza.cortar();
		pizza.empaquetar();

		return pizza;
	}

}
