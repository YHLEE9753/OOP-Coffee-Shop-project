package com.yongcoffee.coffeeShop.model.item;

import java.util.ArrayList;
import java.util.List;

public class OrderSheet {
    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order){
        orderList.add(order);
    }

    public int getTotalPrice(){
        return orderList.stream()
                .mapToInt(Order::getOrderPrice)
                .sum();
    }

    public List<Order> getOrderList() {
        return orderList;
    }
}
