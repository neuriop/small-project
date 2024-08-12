package pizzeria;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.cut(3);
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
