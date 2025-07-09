package Ch4.PizzaStoreAbstractFactoryMethod;

import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.NYPizzaIngredientFactory;
import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.PizzaIngredientFactory;
import Ch4.PizzaStoreAbstractFactoryMethod.Pizzas.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
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
