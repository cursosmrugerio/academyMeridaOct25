package pizzaafV2.store;

import pizzaafV2.factoryIngredient.PizzaIngredientFactory;
import pizzaafV2.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    protected Pizza createPizza(String item) {
		Pizza pizza = null;

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
