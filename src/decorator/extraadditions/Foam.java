package decorator.extraadditions;

import decorator.Beverage;

public class Foam extends DecoratorWrapper {
    public Foam(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + coffee foam";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.2;
    }
}
