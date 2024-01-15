package com.study.exam03;

public class Main {
    public static void main(String[] args) {
        Order order = null;
        order.showOrderInfo();
        Order.OrderBuild orderBuild = Order.builder();
        Order order3 = orderBuild.build();

        Order order2 = Order.builder()
                .orderId(100)
                .productName("Samsung GalaxyBook2 Pro")
                .consumerName("홍길동")
                .price(1450000)
                .stock(2)
                .build();

        System.out.println(order2);

    }


}
