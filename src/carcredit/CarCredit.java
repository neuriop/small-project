package carcredit;

import utils.Colors;

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
        System.out.println("\t\t\t12 mon.\t24 mon.\t36 mon.\t48 mon.\t60 mon.");
        for (int i = 0; i < costTable.length; i++) {
            System.out.print((totalCost/10*(i+3)) + "\t");
            for (int j = 0; j < costTable[i].length; j++) {
                System.out.print(Math.ceil((totalCost/10*(i+3))/month[j]*(costTable[i][j]/100)+(totalCost/10*(i+3))/month[j]) + "\t");
            }
            System.out.println();
        }
    }

    public void carPay(double totalCost, double initialPay){
        int lowDiff = 0;
        for (int i = 1; i < 5; i++)
            if (Math.abs(totalCost/10*(i+3)) < Math.abs(totalCost/10*(lowDiff+3)))
                lowDiff = i;
        if (initialPay != (totalCost/10*(lowDiff+3)))
            System.out.println("Initial pay of " + initialPay + " is not found. The closest initial pay you can make is: " + (totalCost/10*(lowDiff+3)));
        System.out.println("Initial pay %\t" + "Term of credit, monthly pay %");
        System.out.println("\t\t\t12 mon.\t24 mon.\t36 mon.\t48 mon.\t60 mon.");
        System.out.print((totalCost/10*(lowDiff+3)) + "\t");
        for (int i = 0; i < costTable[lowDiff].length; i++) {
            System.out.print(Math.ceil(totalCost/10*(lowDiff+3)/month[i]*(costTable[lowDiff][i]/100)+totalCost/10*(lowDiff+3)/month[i]) + "\t");
        }
        System.out.println();
    }

    public void carPay(double totalCost, double initialPay, double monthlyPay){
        int lowDiff = 0;
        int lowDiff2 = 0;
        for (int i = 1; i < 5; i++)
            if (Math.abs(totalCost/10*(i+3)) < Math.abs(totalCost/10*(lowDiff+3)))
                lowDiff = i;
        if (initialPay != (totalCost/10*(lowDiff+3)))
            System.out.println("Initial pay of " + initialPay + " is not found. The closest initial pay you can make is: " + (totalCost/10*(lowDiff+3)));
        System.out.println("Initial pay %\t" + "Term of credit, monthly pay %");
        System.out.print("\t\t");
        for (int i = 1; i < 5; i++) {
            if (Math.abs(Math.ceil(totalCost/10*(lowDiff+3)/month[i]*(costTable[lowDiff][i]/100)+totalCost/10*(lowDiff+3)/month[i])-monthlyPay) <
                    Math.abs(Math.ceil(totalCost/10*(lowDiff+3)/month[lowDiff2]*(costTable[lowDiff][lowDiff2]/100)+totalCost/10*(lowDiff+3)/month[lowDiff2])-monthlyPay))
                lowDiff2 = i;
        }
        for (int i = 0; i < 5; i++) {
            if (i == lowDiff2)
                System.out.print("\t" + Colors.colorGreen + month[i] + "mon." + Colors.colorDefault);
            else System.out.print("\t" + month[i] + "mon.");
        }
        System.out.println();
        System.out.print((totalCost/10*(lowDiff+3)) + "\t");
        for (int i = 0; i < costTable[lowDiff].length; i++) {
            if (i == lowDiff2)
                System.out.print(Colors.colorGreen + Math.ceil(totalCost/10*(lowDiff+3)/month[i]*(costTable[lowDiff][i]/100)+totalCost/10*(lowDiff+3)/month[i]) + Colors.colorDefault + "\t");
            else
                System.out.print(Math.ceil(totalCost/10*(lowDiff+3)/month[i]*(costTable[lowDiff][i]/100)+totalCost/10*(lowDiff+3)/month[i]) + "\t");
        }
        System.out.println();
    }

    private String costCounter(double cost, double percent) {
        cost = round(cost * percent);
        String shortCost;
        if (cost < 1000)
            shortCost = cost + "";
        else if (cost < 1000000)
            shortCost = cost + "k";
        else shortCost = cost + "m";
        return shortCost;
    }

    private double round(double number) {
        number *= 10;
        number = (int) number;
        number /= 10;
        return number;
    }

}
