package Ch4.PizzaStoreAbstractFactoryMethod;

import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.ChicagoPizzaIngredientFactory;
import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.PizzaIngredientFactory;
import Ch4.PizzaStoreAbstractFactoryMethod.Pizzas.*;

public class ChicagoPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
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