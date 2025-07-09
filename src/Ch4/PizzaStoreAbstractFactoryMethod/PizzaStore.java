package Ch4.PizzaStoreAbstractFactoryMethod;

import Ch4.PizzaStoreAbstractFactoryMethod.Pizzas.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
