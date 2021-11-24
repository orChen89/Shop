package com.or.model;


public class CandyShop extends Shop {


    private Candy[] availableCandies;

    public CandyShop(String shopName, String ownerName, String cashierName, float cashInRegister, boolean isClosed) {
        super(shopName, ownerName, cashierName, cashInRegister, isClosed);

    }

    public void payTaxes() {

        double percent = 0.9;
        cashInRegister *= percent;
        System.out.println("The current amount in the register after taxes is: " + cashInRegister + " ILS");
    }

    public void setAvailableCandies(Candy[] availableCandies) {
        this.availableCandies = availableCandies;
    }

    public CandyShop(String shopName, String ownerName, String cashierName) {
        super(shopName, ownerName, cashierName);

    }

    public void open() {

        System.out.println(shopName + " is open!");
    }

    public void close() {

        System.out.println(shopName + " is closed!");
    }

    public void printMenu() {

        System.out.print("Hello!! Welcome to " + shopName + "!" + " This our candy menu with prices: ");
        for (int i = 0; i < availableCandies.length; i++) {
            System.out.println(availableCandies[i]);
        }
    }

    public void purchaseItem(String name, float amountOfMoney) {

        if (isClosed == true) {
            System.out.println("We are closed right now! Please return tomorrow.");
            return;
        }
        for (int i = 0; i < this.availableCandies.length; ++i) {
            if (name.equals(availableCandies[i].getCandyName())) {
                if (amountOfMoney >= availableCandies[i].getPrice()) {
                    System.out.println(this.availableCandies[i] + " purchased!");
                    this.cashInRegister += amountOfMoney;
                    System.out.println("Current cash in register: " + this.cashInRegister + " ILS");
                } else {
                    System.out.println("You can't purchase " + availableCandies[i].getCandyName() + " with that amount!");
                    System.out.println(availableCandies[i].getCandyName() + " price is " + availableCandies[i].getPrice() + " ILS");
                    System.out.println("Current cash in register: " + this.cashInRegister + " ILS");
                    return;
                }
            }
        }
    }
}





