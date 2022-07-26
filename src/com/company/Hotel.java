package com.company;

public class Hotel implements RentPay {

    int familyMembers;
    String address;

    public Hotel(int familyMembers, String address) {
        this.familyMembers = familyMembers;
        this.address = address;
    }

    public void showAdressAndFamilyMemebers() {
        System.out.println("Family lives in hotel");
        System.out.println("Family members: " + familyMembers);
        System.out.println("Address: " + address);
    }

    @Override
    public void rentPay() {
        RentPay.super.rentPay();
    }
}
