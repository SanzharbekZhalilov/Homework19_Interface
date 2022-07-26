package com.company;

public class Main {
    public static void main(String[] args) {

        Apartment apartment = new Apartment(5, "Bishkek, Sovetskaya 19");
        apartment.showAdressAndFamilyMemebers();
        apartment.utilityPay();

        Dormitory dormitory = new Dormitory(2, "Moscow, Akademika Bakuleva 6");
        dormitory.showAdressAndFamilyMemebers();
        dormitory.rentPay();

        Hotel hotel = new Hotel(3, "New Yowk, Wall Street 13");
        hotel.showAdressAndFamilyMemebers();
        hotel.rentPay();
    }
}