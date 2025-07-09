package Ch4.PizzaStoreAbstractFactoryMethod.Ingredients;

import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.NYStyle.FreshClams;
import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.NYStyle.MarinaraSauce;
import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.NYStyle.ReggianoCheese;
import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.NYStyle.ThinCrustDough;
import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.Vegetables.Garlic;
import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.Vegetables.Mushroom;
import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.Vegetables.Onion;
import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.Vegetables.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
