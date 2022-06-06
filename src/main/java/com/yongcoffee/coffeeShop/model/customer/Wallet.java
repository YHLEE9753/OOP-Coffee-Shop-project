package com.yongcoffee.coffeeShop.model.customer;

import com.yongcoffee.coffeeShop.model.item.Order;
import com.yongcoffee.coffeeShop.model.item.OrderSheet;

import java.util.List;

public class Wallet {
    private int cash;

    public Wallet(int cash) {
        this.cash = cash;
    }

    // Wallet 이 Order 을 알 필요가 있을까??
    public int checkMoney(int totalPrice) {
        if (cash - totalPrice < 0) {
            // 단순성을 위해 -1 로 반환, validation 은 진행하지 않음
            return -1;
        }

        cash -= totalPrice;
        return totalPrice;
    }
}
