package com.yongcoffee.coffeeShop.model.shopmember;

import com.yongcoffee.coffeeShop.model.item.Order;

import java.util.List;

public class Cashier {
    private final CashMachine cashMachine;
    private final Barista barista;

    public Cashier(CashMachine cashMachine, Barista barista) {
        this.cashMachine = cashMachine;
        this.barista = barista;
    }

    public List<Order> getOrder(List<Order> orderList, int orderMoney) {
        cashMachine.checkMoney(orderMoney);
        return barista.getOrder(orderList);
    }
}
