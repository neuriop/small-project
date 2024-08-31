package main;

import caller.NumberChecker;
import carcredit.CarCredit;

public class Main {
    public static void main(String[] args){

        CarCredit carCredit = new CarCredit();
        carCredit.tableOut();
        System.out.println("----------------------------------");
        carCredit.carPay(1000000); // output monthly cost board
        System.out.println("----------------------------------");
        carCredit.carPay(1000000, 300000); // output monthly cost board for current initial pay
        System.out.println("----------------------------------");
        carCredit.carPay(1000000, 300000, 10000); // output monthly cost for current initial pay, and highlights the closest monthly pay to provided

        // carpay(300000, 10000)
        // = 24 міс




//        NumberChecker numberChecker = new NumberChecker();
//        numberChecker.call("567999");


    }
}
