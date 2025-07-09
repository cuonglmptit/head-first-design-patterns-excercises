package Ch4.PizzaStoreAbstractFactoryMethod.Pizzas;

import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
