package pizzaaf.cliente;

import pizzaaf.pizza.Pizza;
import pizzaaf.store.ChicagoPizzaStore;
import pizzaaf.store.NYPizzaStore;
import pizzaaf.store.PizzaStore;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
        Pizza pizza;
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza + "\n");

//		pizza = nyStore.orderPizza("clam");
//		System.out.println("Ethan ordered a " + pizza + "\n");
//
//		pizza = chicagoStore.orderPizza("clam");
//		System.out.println("Joel ordered a " + pizza + "\n");
//
//		pizza = nyStore.orderPizza("pepperoni");
//		System.out.println("Ethan ordered a " + pizza + "\n");
//
//		pizza = chicagoStore.orderPizza("pepperoni");
//		System.out.println("Joel ordered a " + pizza + "\n");
//
//		pizza = nyStore.orderPizza("veggie");
//		System.out.println("Ethan ordered a " + pizza + "\n");
//
//		pizza = chicagoStore.orderPizza("veggie");
//		System.out.println("Joel ordered a " + pizza + "\n");
	}
}
