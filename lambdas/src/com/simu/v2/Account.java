package com.simu.v2;

import java.util.function.Predicate;

@FunctionalInterface
interface AmountValidator {
    public boolean checkAmount(double value);
}

public class Account {
    public void updateBalance(double bal) {
        //Predicate<Double> pred = val ->  val >= 0.0;
        //boolean isOK = pred.test(bal);
        boolean isOk =
                ((Predicate<Double>)(val->val >= 0.0)).test(bal);
        System.out.println("boolean is " + isOk);
    }
    public static void main(String[] args) {
        System.out.println("V2");
        new Account().updateBalance(1); //true
        new Account().updateBalance(-1); //false
    }
}

