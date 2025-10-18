package pizzaafV2.store;

import pizzaafV2.factoryIngredient.PizzaIngredientFactory;
import pizzaafV2.pizza.*;

public class TlaxcalaPizzaStore extends PizzaStore  {
    public TlaxcalaPizzaStore(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    protected Pizza createPizza(String item) {
        Pizza pizza = null;

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Tlaxcala Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Tlaxcala Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Tlaxcala Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Tlaxcala Style Pepperoni Pizza");

        }
        return pizza;
    }
}
