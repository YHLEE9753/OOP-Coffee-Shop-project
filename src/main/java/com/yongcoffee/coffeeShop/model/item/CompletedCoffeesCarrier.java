package com.yongcoffee.coffeeShop.model.item;

import java.util.ArrayList;
import java.util.List;

public class CompletedCoffeesCarrier {
    private List<CompletedCoffees> coffeesCarrier = new ArrayList<>();

    public void addCoffee(CompletedCoffees completedCoffees){
        coffeesCarrier.add(completedCoffees);
    }

    public List<CompletedCoffees> getCoffeesCarrier() {
        return coffeesCarrier;
    }
}
