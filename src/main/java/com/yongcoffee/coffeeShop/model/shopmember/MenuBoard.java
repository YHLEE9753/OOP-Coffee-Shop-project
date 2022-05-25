package com.yongcoffee.coffeeShop.model.shopmember;

import com.yongcoffee.coffeeShop.model.item.CoffeeSize;
import com.yongcoffee.coffeeShop.model.item.CoffeeType;

import java.util.List;
import java.util.Map;

public class MenuBoard {
    private final Map<CoffeeType, Integer> coffeeTypes = CoffeeType.getValues();
    private final List<CoffeeSize> coffeeSizes = CoffeeSize.getValues();

    public Map informMenusAndPrice() {
        return coffeeTypes;
    }

    public List informSizes() {
        return coffeeSizes;
    }
}
