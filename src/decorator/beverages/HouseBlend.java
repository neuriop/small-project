package decorator.beverages;

import decorator.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        this.description = "The blend made in house";
    }

    @Override
    public double getCost() {
        return 1.5;
    }
}
