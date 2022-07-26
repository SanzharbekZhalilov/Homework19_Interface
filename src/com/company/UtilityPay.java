package com.company;

public interface UtilityPay {

    default void utilityPay() {
        System.out.println("Pays utility bills\n");
    }
}
