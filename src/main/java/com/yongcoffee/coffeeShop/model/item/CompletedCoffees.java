package com.yongcoffee.coffeeShop.model.item;

import java.util.ArrayList;
import java.util.List;

public class CompletedCoffees {
    private Coffee coffee;
    private OrderStatus orderStatus;
    private int count;
    private String baristaName;

    public CompletedCoffees(Coffee coffee, int count, OrderStatus orderStatus, String baristaName) {
        this.coffee = coffee;
        this.orderStatus = orderStatus;
        this.count = count;
        this.baristaName = baristaName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompletedCoffees{");
        sb.append("coffee=").append(coffee);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", count=").append(count);
        sb.append(", baristaName='").append(baristaName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
