package main;

import carcredit.CarCredit;

public class Main {
    public static void main(String[] args){

        CarCredit carCredit = new CarCredit();
        carCredit.tableOut();
        carCredit.carPay(1000000);

//        double a = 10.0 / 3.0;
//        a = carCredit.round(a);
//        System.out.println(a);


    }
}
