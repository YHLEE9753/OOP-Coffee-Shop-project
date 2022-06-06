package com.yongcoffee.coffeeShop.model.shopmember;

import com.yongcoffee.coffeeShop.model.item.*;

import java.util.List;

public class Barista {
    private final String name;

    public Barista(String name) {
        this.name = name;
    }

    public CompletedCoffeesCarrier getOrder(OrderSheet orderSheet) {
        return makeCoffees(orderSheet);
    }

    private CompletedCoffeesCarrier makeCoffees(OrderSheet orderSheet) {
        CompletedCoffeesCarrier coffeesCarrier = new CompletedCoffeesCarrier();
        for (Order order : orderSheet.getOrderList()) {
            CompletedCoffees completedCoffees = new CompletedCoffees(order.getCoffee(), order.getCount(), OrderStatus.COMPLETED, name);
            coffeesCarrier.addCoffee(completedCoffees);
        }

        return coffeesCarrier;
    }
}
