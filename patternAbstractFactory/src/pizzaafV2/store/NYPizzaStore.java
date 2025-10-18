package pizzaafV2.store;

import pizzaafV2.factoryIngredient.PizzaIngredientFactory;
import pizzaafV2.pizza.*;

public class NYPizzaStore extends PizzaStore {

    //La class NYPizzaStore no conoce su fabrica de forma concreta
    //La fabrica va a ser INYECTADA por CONSTRUCTOR
    public NYPizzaStore(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
 
		if (item.equals("cheese")) {
  
            pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
