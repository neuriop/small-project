package main;

import pizzeria.CheesePizzaStore;
import pizzeria.Pizza;

public class Main {
    public static void main(String[] args){

        CheesePizzaStore pizzaStore1 = new CheesePizzaStore();
        Pizza pizza = pizzaStore1.orderPizza("cheese");
        System.out.println(pizza.getCost());


    }
}
