package com.or.model;

public class Main {
    static final Candy bazooka = new Candy("Bazooka", 0.5);
    static final Candy jellyBeans = new Candy("JellyBeans", 2);
    static final Candy pez = new Candy("Pez", 2.5);
    static final Candy kinder = new Candy("Kinder", 5);
    static final Candy hamzuzim = new Candy("Hamzuzim", 1.5);
    static final Candy oreo = new Candy("Oreo", 8);

    static final Game nba2022 = new Game("Nba-2022", 250);
    static final Game fifa2022 = new Game("Fifa-2022", 280);
    static final Game superMario = new Game("Super Mario", 30);
    static final Game warzone = new Game("Warzone", 220);
    static final Game doom = new Game("Doom", 120);
    static final Game worms = new Game("Worms", 45);
    static final Game hitman = new Game("Hitman", 60);
    static final Game tombRider = new Game("Tomb Rider", 35);

    public static void main(String[] args) {

        final Candy [] candy = new Candy [] {bazooka, jellyBeans, pez, kinder, hamzuzim, oreo};

        CandyShop s1 = new CandyShop("Candy-Land","Or","Yossi",0,false);

        Game [] game = new Game [] {nba2022, fifa2022, superMario, warzone, doom, worms, hitman,tombRider};

        GameShop s2 = new GameShop("Gamer Pro","Kobi", "Gil",0,false);

        s1.setAvailableCandies(candy);
        s2.setAvailableGames(game);

        s1.printMenu();
        System.out.println();
        s1.purchaseItem("Kinder", 5);
        System.out.println();
        s1.close();
        System.out.println();

        s2.open();
        s2.printMenu();
        System.out.println();
        s2.purchaseItem("Doom", 140);
        System.out.println();

        System.out.println(Shop.whichIsMoreSuccessful(s1, s2).getShopName() + " is more successful!");
        System.out.println();

        s1.payTaxes();
        s2.payTaxes();
        System.out.println();

        ShopFactory s = new ShopFactory();
        s.getShop("CANDY");
        System.out.println();
        s.getShop("GAME");
        System.out.println();
        s.getShop("SPORT");
    }
}
