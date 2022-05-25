package com.yongcoffee.coffeeShop.model.item;

public class Coffee {
    CoffeeType coffeeType;
    CoffeeSize coffeeSize;
    CoffeeStatus coffeeStatus;
    String baristaName;

    public Coffee(CoffeeType coffeeType, CoffeeSize coffeeSize) {
        this.coffeeType = coffeeType;
        this.coffeeSize = coffeeSize;
        this.coffeeStatus = CoffeeStatus.ORDERED;
        this.baristaName = "";
    }

    public void setBaristaName(String baristaName) {
        this.baristaName = baristaName;
    }
}
