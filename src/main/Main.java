package main;

import caller.IsBlacklisted;
import caller.NumberChecker;

public class Main {
    public static void main(String[] args){

        NumberChecker numberChecker = new NumberChecker();
        IsBlacklisted.addNumber("567999");

        numberChecker.call("567999");

    }
}
