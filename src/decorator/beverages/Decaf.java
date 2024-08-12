package decorator.beverages;

import decorator.Beverage;

public class Decaf extends Beverage {

    public Decaf(){
        this.description = "Decimal af";
    }
    @Override
    public double getCost() {
        return 2.1;
    }
}
