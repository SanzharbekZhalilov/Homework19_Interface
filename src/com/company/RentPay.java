package com.company;

public interface RentPay {

    default void rentPay() {
        System.out.println("Pays rent payments\n");
    }
}
