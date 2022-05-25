package com.yongcoffee.coffeeShop.model.customer;

import com.yongcoffee.coffeeShop.model.item.Coffee;
import com.yongcoffee.coffeeShop.model.item.CoffeeSize;
import com.yongcoffee.coffeeShop.model.item.CoffeeType;
import com.yongcoffee.coffeeShop.model.item.Order;
import com.yongcoffee.coffeeShop.model.shopmember.Cashier;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final Wallet wallet;
    private final String customerName;
    private final Cashier cashier;
    private List<Order> orderList = new ArrayList<>();

    public Customer(Wallet wallet, String customerName, Cashier cashier) {
        this.wallet = wallet;
        this.customerName = customerName;
        this.cashier = cashier;
    }

    public List<Order> makeOrder() {
        return cashier.getOrder(orderList, checkMoney());
    }

    public void chooseCoffee(CoffeeType coffeeType, CoffeeSize coffeeSize, int count) {
        Coffee orderCoffee = new Coffee(coffeeType, coffeeSize);
        Order order = new Order(orderCoffee, count, customerName);
        orderList.add(order);
    }

    private int checkMoney() {
        return wallet.checkMoney(orderList);
    }
}
