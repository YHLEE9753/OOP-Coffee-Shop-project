package com.yongcoffee.coffeeShop.controller;

import com.yongcoffee.coffeeShop.model.customer.Customer;
import com.yongcoffee.coffeeShop.model.customer.Wallet;
import com.yongcoffee.coffeeShop.model.item.CoffeeSize;
import com.yongcoffee.coffeeShop.model.item.CoffeeItem;
import com.yongcoffee.coffeeShop.model.item.CompletedCoffeesCarrier;
import com.yongcoffee.coffeeShop.model.item.Order;
import com.yongcoffee.coffeeShop.model.shopmember.Barista;
import com.yongcoffee.coffeeShop.model.shopmember.CashMachine;
import com.yongcoffee.coffeeShop.model.shopmember.Cashier;
import com.yongcoffee.coffeeShop.model.shopmember.MenuBoard;

import java.util.List;

public class CoffeeShopController {
    public static void main(String[] args) {
        MenuBoard menuBoard = new MenuBoard();
        Barista barista = new Barista("Yong Barista");
        CashMachine cashMachine = new CashMachine(100_000);
        Cashier cashier = new Cashier(cashMachine, barista);
        Wallet wallet = new Wallet(50_000);
        Customer customer = new Customer(wallet, "Hoon Customer");

        // 시나리오 시작
        // 1. MenuBoard 는 메뉴와 가격, 사이즈를 보여준다.
        menuBoard.informMenusAndPrice();
        menuBoard.informSizes();

        // 2. customer 가 메뉴를 고른다(메뉴 선택 console 과정 무시), (커피 사이즈에 따른 가격 차이 무시)
        customer.chooseCoffee(CoffeeItem.AMERICANO, CoffeeSize.BIG, 5);
        customer.chooseCoffee(CoffeeItem.LATTE, CoffeeSize.SMALL, 3);

        // 3. cashier 에게 주문을 하면 커피를 받는다.
        CompletedCoffeesCarrier coffeesCarrier = customer.makeOrder(cashier);

        // 4. 주문 받은 커피를 확인해 보자
        coffeesCarrier.getCoffeesCarrier().stream().forEach(System.out::println);
    }
}
