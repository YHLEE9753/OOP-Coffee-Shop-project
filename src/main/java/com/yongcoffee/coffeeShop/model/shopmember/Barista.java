package com.yongcoffee.coffeeShop.model.shopmember;

import com.yongcoffee.coffeeShop.model.item.Order;

import java.util.List;

public class Barista {
    private final String name;

    public Barista(String name) {
        this.name = name;
    }

    public List<Order> getOrder(List<Order> orderList) {
        return makeCoffees(orderList);
    }

    private List<Order> makeCoffees(List<Order> orderList) {
        for (Order order : orderList) {
            order.coffeeCompleted(name);
            order.orderCompleted();
        }

        return orderList;
    }
}
