package com.yongcoffee.coffeeShop.model.item;

public class Coffee {
    CoffeeItem coffeeItem;
    CoffeeSize coffeeSize;
    CoffeeStatus coffeeStatus;

    public Coffee(CoffeeItem coffeeItem, CoffeeSize coffeeSize) {
        this.coffeeItem = coffeeItem;
        this.coffeeSize = coffeeSize;
        this.coffeeStatus = CoffeeStatus.ORDERED;
    }
}
