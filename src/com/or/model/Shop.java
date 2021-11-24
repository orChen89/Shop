package com.or.model;

interface Business{

     void payTaxes();
     }

public abstract class Shop implements Business{

    protected String shopName;
    private String ownerName;
    private String cashierName;
    protected float cashInRegister = 0;
    protected boolean isClosed = true;

    public Shop(String shopName, String ownerName, String cashierName, float cashInRegister, boolean isClosed) {

        this.shopName =shopName;
        this.ownerName = ownerName;
        this.cashierName = cashierName;
        this.cashInRegister = cashInRegister;
        this.isClosed = isClosed;
    }

    public Shop(String shopName, String ownerName, String cashierName){
        this.shopName =shopName;
        this.ownerName = ownerName;
        this.cashierName = cashierName;
    }

    public String getShopName() {
        return shopName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public float getCashInRegister() {
        return cashInRegister;
    }

    public void setCashInRegister(float cashInRegister) {
        this.cashInRegister = cashInRegister;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public abstract void open();

    public abstract void close();

    public abstract void printMenu();

    public abstract void purchaseItem(String name, float amountOfMoney);

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", cashierName='" + cashierName + '\'' +
                '}';
    }

    public static Shop whichIsMoreSuccessful(Shop s1, Shop s2){
        if (s1.getCashInRegister() > s2.getCashInRegister()){
        return s1 ;
        } else {
        return s2;
        }

    }
}
