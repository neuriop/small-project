package carcredit;

public class CarCredit {
    private final double[][] costTable = {
            {3.49, 6.99, 8.99, 11.99, 11.99},
            {2.49, 5.99, 8.99, 11.99, 11.99},
            {1.49, 4.99, 7.49, 9.99, 9.99},
            {0.01, 3.99, 5.49, 9.99, 9.99},
            {0.01, 0.01, 4.99, 7.99, 7.99}};
    private final int[] month = {12, 24, 36, 48, 60};

    public void tableOut() {
        System.out.println("Initial pay %\t" + "Term of credit, monthly pay %");
        for (int i = 0; i < costTable.length; i++) {
            System.out.print("\t" + (i + 3) * 10 + "%\t\t\t");
            for (int j = 0; j < costTable[i].length; j++) {
                System.out.print(costTable[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void carPay(double totalCost) {
        System.out.println("Initial pay %\t" + "Term of credit, monthly pay %");
        for (int i = 0; i < costTable.length; i++) {
            System.out.print("\t" + costCounter(totalCost, (i + 3)/10.0) + "\t\t\t");
            for (int j = 0; j < costTable[i].length; j++) {
                System.out.print(costCounter(totalCost * (costTable[i][j] / 100) / month[j], 1) + "\t");
            }
            System.out.println();
        }
    }

    public String costCounter(double cost, double percent) {
        cost = round(cost * percent);
        String shortCost;
        if (cost < 1000)
            shortCost = cost + "";
        else if (cost < 1000000)
            shortCost = cost + "k";
        else shortCost = cost + "m";
        return shortCost;
    }

    public double round(double number) {
        number *= 10;
        number = (int) number;
        number /= 10;
        return number;
    }

}
