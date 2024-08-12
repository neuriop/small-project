package decorator.extraadditions;

import decorator.Beverage;

public class Cream extends DecoratorWrapper {
    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + cream";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.5;
    }
}
