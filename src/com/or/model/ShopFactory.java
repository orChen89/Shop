package com.or.model;

import java.util.Scanner;

enum availableShopTypes{
    CANDY, GAME
}

public class ShopFactory {

    Scanner SCANNER = new Scanner(System.in);

    public Shop getShop(String shopType){

        String shopName;
        String ownerName;
        String cashierName;
        Shop shop = null;
        
        if (shopType.equals(availableShopTypes.CANDY.toString())){
            System.out.println("Great! A new Candy shop is creating! Please enter the following properties: ");
            System.out.println("Shop name, Owner name & Cashier name: ");
            shop = new CandyShop(shopName = SCANNER.nextLine(),ownerName = SCANNER.nextLine(), cashierName = SCANNER.nextLine());
            System.out.println("The new Candy shop " + " ** " +  shop.getShopName() + " ** " + " has been created!");

        } else if(shopType.equals(availableShopTypes.GAME.toString())){
            System.out.println("Great! A new Game shop is creating! Please enter the following properties: ");
            System.out.println("Shop name, Owner name & Cashier name: ");
            shop = new GameShop(shopName = SCANNER.nextLine(),ownerName = SCANNER.nextLine(), cashierName = SCANNER.nextLine());
            System.out.println("The new Game shop " + " ** " +  shop.getShopName() + " ** " + " has been created!");
        } else{
            System.out.println("We couldn't found the desired shop!");
        }
        return shop;
    }
}





















