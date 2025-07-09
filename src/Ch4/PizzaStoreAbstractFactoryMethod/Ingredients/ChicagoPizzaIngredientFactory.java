package Ch4.PizzaStoreAbstractFactoryMethod.Ingredients;

import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.ChicagoStyle.FrozenClams;
import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.ChicagoStyle.MozzarellaCheese;
import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.ChicagoStyle.PlumTomatoSauce;
import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.ChicagoStyle.ThickCrustDough;
import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.Vegetables.BlackOlives;
import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.Vegetables.EggPlant;
import Ch4.PizzaStoreAbstractFactoryMethod.Ingredients.Vegetables.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
