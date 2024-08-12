package decorator.extraadditions;

import decorator.Beverage;

public abstract class DecoratorWrapper extends Beverage {
    protected Beverage beverage;

    @Override
    public abstract String getDescription();

    @Override
    public double getCost() {
        return 0;
    }
}