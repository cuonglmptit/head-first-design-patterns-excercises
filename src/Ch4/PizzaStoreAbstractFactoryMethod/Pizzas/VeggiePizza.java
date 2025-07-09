package Ch4.PizzaStoreAbstractFactoryMethod.Pizzas;

import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }}
