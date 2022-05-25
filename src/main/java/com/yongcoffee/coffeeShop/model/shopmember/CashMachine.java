package com.yongcoffee.coffeeShop.model.shopmember;

public class CashMachine {
    private int cash;

    public CashMachine(int cash) {
        this.cash = cash;
    }

    public int checkMoney(int getMoney) {
        if (cash - getMoney < 0) {
            // 단순성을 위해 -1 로 반환, validation 은 진행하지 않음
            return -1;
        }

        cash -= getMoney;
        return getMoney;
    }
}
