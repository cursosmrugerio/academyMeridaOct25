package pizzaafV2.store;

import pizzaafV2.factoryIngredient.PizzaIngredientFactory;
import pizzaafV2.pizza.Pizza;

public abstract class PizzaStore {

    //HAS-A
    PizzaIngredientFactory ingredientFactory;

    PizzaStore(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

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
