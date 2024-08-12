package decorator.beverages;

import decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso(){
        this.description = "Not expresso";
    }
    @Override
    public double getCost() {
        return 2;
    }
}
