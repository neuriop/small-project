package decorator.extraadditions;

import decorator.Beverage;

public class Chocolate extends DecoratorWrapper {
    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + chocolate";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.3;
    }
}
