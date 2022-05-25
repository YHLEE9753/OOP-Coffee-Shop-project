package com.yongcoffee.coffeeShop.model.item;

import java.util.*;

public enum CoffeeType {
    AMERICANO("Americano", 1900),
    LATTE("Latte", 2500),
    GREEN_TEA("GreenTea", 4000);

    private final String name;
    private final Integer price;

    private static final Map<CoffeeType, Integer> VALUES;

    static {
        VALUES = new HashMap<>();
        for (CoffeeType coffeeType : CoffeeType.values()) {
            VALUES.put(coffeeType, coffeeType.price);
        }
    }

    CoffeeType(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static Map<CoffeeType, Integer> getValues() {
        return VALUES;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPrice() {
        return this.price;
    }
}
