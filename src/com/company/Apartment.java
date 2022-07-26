package com.company;

public class Apartment implements UtilityPay {

    int familyMembers;
    String address;

    public Apartment(int familyMembers, String address) {
        this.familyMembers = familyMembers;
        this.address = address;
    }

    public void showAdressAndFamilyMemebers() {
        System.out.println("Family lives in apartment");
        System.out.println("Family members: " + familyMembers);
        System.out.println("Address: " + address);
    }

    @Override
    public void utilityPay() {
        UtilityPay.super.utilityPay();
    }
}
