package pizzeria;

public class CheesePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new CheesePizza();
        else return new Pizza();
    }
}
