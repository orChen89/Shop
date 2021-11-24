package com.or.model;

public class Game {

    public final String gameName;
    public double price;

    public Game(String gameName, double price) {
        this.gameName = gameName;
        this.price = price;
    }

    public String getGameName() {
        return gameName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", price=" + price +
                '}';
    }
}