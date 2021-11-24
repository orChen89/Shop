package com.or.model;

public class GameShop extends Shop {

    protected Game [] availableGames;

    public GameShop(String shopName, String ownerName, String cashierName, float cashInRegister, boolean isClosed) {
        super(shopName,ownerName, cashierName, cashInRegister, isClosed);

    }

    public GameShop(String shopName, String ownerName, String cashierName ) {
        super(shopName, ownerName, cashierName);
    }

    public void payTaxes(){
        double percent = 0.85;
        cashInRegister *= percent;
        System.out.println("The current amount in the register after taxes is: " + cashInRegister + " ILS");
    }

    public void setAvailableGames(Game[] availableGames) {
        this.availableGames = availableGames;
    }

    public void open() {

        System.out.println(shopName + " is open!");
    }

    public void close() {

        System.out.println(shopName + " is closed!");
    }

    public void printMenu() {

        System.out.print("Hello!! Welcome to " + shopName + "!"  + " This our available games with prices: ");
        for (int i = 0; i < availableGames.length; i++) {
            System.out.println(availableGames[i]);
        }
    }
    public void purchaseItem (String name,float amountOfMoney) {

        if (isClosed == true) {
            System.out.println("We are closed right now! Please return in other time.");
            return;
        }
        for (int i = 0; i < availableGames.length; ++i) {
            if (name.equals(availableGames[i].getGameName())){
                if (amountOfMoney >= availableGames[i].getPrice()) {
                   System.out.println(this.availableGames[i] + " purchased!");
                   this.cashInRegister += amountOfMoney;
                   System.out.println("Current cash in register: " + this.cashInRegister + " ILS");
                } else{
                   System.out.println("You can't purchase " + availableGames[i].getGameName() + " with that amount!");
                   System.out.println(availableGames[i].getGameName() + " price is " + availableGames[i].getPrice() + " ILS");
                   System.out.println("Current cash in register: " + this.cashInRegister + " ILS");
                }return;
            }
        }
    }
}

