package Ch4.PizzaStoreAbstractFactoryMethod.Pizzas;

import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
