package decorator.beverages;

import decorator.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        this.description = "The roast dark";
    }

    @Override
    public double getCost() {
        return 1.7;
    }
}
