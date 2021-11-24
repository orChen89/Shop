package com.or.model;

public class Candy {

    public final String candyName;
    public double price;

    public Candy(String candyName, double price) {
        this.candyName = candyName;
        this.price = price;
    }

    public String getCandyName() {
        return candyName;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "candyName='" + candyName + '\'' +
                ", price=" + price +
                '}';
    }
}
