package pizzeria;

public class Pizza {
    protected int pieces = 1;
    protected double weight;
    protected double energy;
    protected double cost;

    public void cut(int times){
        pieces = times * 2;
    }

    public double getCost() {
        return cost;
    }
}
