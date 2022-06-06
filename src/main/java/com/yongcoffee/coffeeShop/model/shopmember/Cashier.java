package com.yongcoffee.coffeeShop.model.shopmember;

import com.yongcoffee.coffeeShop.model.item.CompletedCoffeesCarrier;
import com.yongcoffee.coffeeShop.model.item.Order;
import com.yongcoffee.coffeeShop.model.item.OrderSheet;

import java.util.List;

public class Cashier {
    private final CashMachine cashMachine;
    private final Barista barista;

    public Cashier(CashMachine cashMachine, Barista barista) {
        this.cashMachine = cashMachine;
        this.barista = barista;
    }

    public CompletedCoffeesCarrier getOrder(OrderSheet orderSheet, int orderMoney) {
        cashMachine.checkMoney(orderMoney);
        // 여기서 주문을 돌면서(for) 여러 바리스타에게 할당하는것 스케줄링하는것도
        // 고려해 보면 좋을 거 같다
        return barista.getOrder(orderSheet);
    }
}
