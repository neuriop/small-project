package pizzeria;

public class PepperoniPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("pepperoni"))
            return new PepperoniPizza();
        else return new Pizza();
    }
}
