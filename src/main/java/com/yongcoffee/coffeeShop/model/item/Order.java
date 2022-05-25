package com.yongcoffee.coffeeShop.model.item;


public class Order {
    private Coffee coffee;
    private OrderStatus orderStatus;
    private int count;
    private String customerName;
    private Integer orderPrice;

    public Order(Coffee coffee, int count, String customerName) {
        this.coffee = coffee;
        this.orderStatus = OrderStatus.ORDERED;
        this.count = count;
        this.customerName = customerName;
        orderPrice = coffee.coffeeType.getPrice() * count;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public void coffeeCompleted(String baristaName) {
        coffee.coffeeStatus = CoffeeStatus.COMPLETED;
        coffee.setBaristaName(baristaName);
    }

    public void orderCompleted() {
        orderStatus = OrderStatus.COMPLETED;
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
