package com.simu.v1;

@FunctionalInterface
interface AmountValidator {
    public boolean checkAmount(double value);
}

public class Account {
    public void updateBalance(double bal) {
        //             CLASE ANONIMA
        boolean isOK = new AmountValidator() {
            @Override
            public boolean checkAmount(double val) {
                return val >= 0.0;
            }
        }.checkAmount(bal);
        System.out.println("boolean is " + isOK);
    }
    public static void main(String[] args) {
        new Account().updateBalance(1); //true
        new Account().updateBalance(-1); //false
    }
}

