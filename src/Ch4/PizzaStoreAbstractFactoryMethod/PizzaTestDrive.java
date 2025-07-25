package Ch4.PizzaStoreAbstractFactoryMethod;

import Ch4.PizzaStoreAbstractFactoryMethod.Pizzas.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}