package pizzaaf.store;

import pizzaaf.pizza.Pizza;

public abstract class PizzaStore {

    //Pattern Factory Method
	protected abstract Pizza createPizza(String item);

	final public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
