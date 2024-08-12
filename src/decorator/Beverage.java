package decorator;

import utils.BasicOperations;

public abstract class Beverage {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double getCost();


}
