package com.yongcoffee.coffeeShop.model.customer;

import com.yongcoffee.coffeeShop.model.item.Order;

import java.util.List;

public class Wallet {
    private int cash;

    public Wallet(int cash) {
        this.cash = cash;
    }

    public int checkMoney(List<Order> orderList) {
        int orderPrice = orderList.stream()
                .mapToInt(Order::getOrderPrice)
                .sum();

        if (cash - orderPrice < 0) {
            // 단순성을 위해 -1 로 반환, validation 은 진행하지 않음
            return -1;
        }

        cash -= orderPrice;
        return orderPrice;
    }
}
