package com.yongcoffee.coffeeShop.model.customer;

import com.yongcoffee.coffeeShop.model.item.*;
import com.yongcoffee.coffeeShop.model.shopmember.Cashier;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final Wallet wallet;
    private final String customerName;
    private OrderSheet orderSheet;

    public Customer(Wallet wallet, String customerName) {
        this.wallet = wallet;
        this.customerName = customerName;
    }

    public CompletedCoffeesCarrier makeOrder(Cashier cashier) {
        return cashier.getOrder(orderSheet, checkMoney());
    }

    public void chooseCoffee(CoffeeItem coffeeItem, CoffeeSize coffeeSize, int count) {
        Coffee orderCoffee = new Coffee(coffeeItem, coffeeSize);
        Order order = new Order(orderCoffee, count, customerName);
        orderSheet.addOrder(order);
    }

    private int checkMoney() {
        return wallet.checkMoney(orderSheet.getTotalPrice());
    }
}
