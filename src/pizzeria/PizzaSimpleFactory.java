package pizzeria;

public class PizzaSimpleFactory {
    public Pizza createPizza(String type){
        Pizza pizza;
        if (type.equals("cheese"))
            pizza = new CheesePizza();
        else if (type.equals("pepperoni"))
            pizza = new PepperoniPizza();
        else pizza = new Pizza();

        return pizza;
    }
}
