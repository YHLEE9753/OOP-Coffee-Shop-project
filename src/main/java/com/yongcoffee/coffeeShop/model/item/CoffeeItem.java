package com.yongcoffee.coffeeShop.model.item;

import java.util.*;

public enum CoffeeItem {
    AMERICANO("Americano", 1900),
    LATTE("Latte", 2500),
    GREEN_TEA("GreenTea", 4000);

    private final String name;
    private final Integer price;

    private static final Map<CoffeeItem, Integer> VALUES; // coffeeType - size ( 사이즈를 고려해서 다시 설게해보자 )

    static {
        VALUES = new HashMap<>();
        for (CoffeeItem coffeeItem : CoffeeItem.values()) {
            VALUES.put(coffeeItem, coffeeItem.price);
        }
    }

    CoffeeItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static Map<CoffeeItem, Integer> getValues() {
        return VALUES;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPrice() {
        return this.price;
    }
}
