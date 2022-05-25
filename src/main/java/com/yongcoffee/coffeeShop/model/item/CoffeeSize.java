package com.yongcoffee.coffeeShop.model.item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum CoffeeSize {
    SMALL,
    NORMAL,
    BIG;

    private static final List<CoffeeSize> VALUES;

    static {
        VALUES = new ArrayList<>();
        for (CoffeeSize coffeeSize : CoffeeSize.values()) {
            VALUES.add(coffeeSize);
        }
    }

    public static List<CoffeeSize> getValues() {
        return Collections.unmodifiableList(VALUES);
    }
}
