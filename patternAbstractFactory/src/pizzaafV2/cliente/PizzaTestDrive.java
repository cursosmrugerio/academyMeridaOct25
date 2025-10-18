package pizzaafV2.cliente;

import pizzaafV2.factoryIngredient.*;
import pizzaafV2.factoryIngredient.PizzaIngredientFactory;
import pizzaafV2.pizza.Pizza;
import pizzaafV2.store.ChicagoPizzaStore;
import pizzaafV2.store.NYPizzaStore;
import pizzaafV2.store.PizzaStore;
import pizzaafV2.store.TlaxcalaPizzaStore;

public class PizzaTestDrive {

    static PizzaIngredientFactory factoryNy =
                new NYPizzaIngredientFactory();

    static PizzaIngredientFactory factoryChicago =
            new ChicagoPizzaIngredientFactory();
 
	public static void main(String[] args) {
        System.out.println("V2");
        Pizza pizza;
		PizzaStore nyStore = new NYPizzaStore(factoryNy);
		PizzaStore chicagoStore = new ChicagoPizzaStore(factoryChicago);

        PizzaStore tlaxcalaStore = new TlaxcalaPizzaStore(factoryChicago);
 
		pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza + "\n");

        pizza = tlaxcalaStore.orderPizza("cheese");
        System.out.println("Patrobas ordered a " + pizza + "\n");

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
