package com.yongcoffee.coffeeShop.model.shopmember;

import com.yongcoffee.coffeeShop.model.item.CoffeeSize;
import com.yongcoffee.coffeeShop.model.item.CoffeeItem;

import java.util.List;
import java.util.Map;

public class MenuBoard {
    private final Map<CoffeeItem, Integer> coffeeTypes = CoffeeItem.getValues();
    private final List<CoffeeSize> coffeeSizes = CoffeeSize.getValues();

    public Map<CoffeeItem, Integer> informMenusAndPrice() {
        return coffeeTypes;
    }

    public List<CoffeeSize> informSizes() {
        return coffeeSizes;
    }
}
