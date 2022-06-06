package com.yongcoffee.coffeeShop.model.item;


public class Order {
    private Coffee coffee;
    private OrderStatus orderStatus;
    private int count;
    private String customerName;
    private Integer orderPrice;

    // 총액 까지 변수로 추가해서 관리하자
    // 받는 거는 Order 대신 Coffee 와 영수증 을 반환하는게 더 맞는 성질 + 설계이다.
    public Order(Coffee coffee, int count, String customerName) {
        this.coffee = coffee;
        this.orderStatus = OrderStatus.ORDERED;
        this.count = count;
        this.customerName = customerName;
        orderPrice = coffee.coffeeItem.getPrice() * count;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("coffee=").append(coffee);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", count=").append(count);
        sb.append(", customerName='").append(customerName).append('\'');
        sb.append(", orderPrice=").append(orderPrice);
        sb.append('}');
        return sb.toString();
    }
}
