package com.study.exam03;

class Order {
    private static int orderId;
    private static String productName;
    private static String consumerName;
    private static int price;
    private static int stock;

    public Order(int orderId, String productName, String consumerName, int price, int stock) {
        this.orderId = orderId;
        this.productName = productName;
        this.consumerName = consumerName;
        this.price = price;
        this.stock = stock;
    }

    public Order() {

    }

    public void showOrderInfo() {
        System.out.println("주문번호 : " + orderId);
        System.out.println("상품명 : " + productName);
        System.out.println("구매자 : " + consumerName);
        System.out.println("가격 : " + price);
        System.out.println("수량 : " + stock);
    }

    public static OrderBuild builder() {
        return new OrderBuild();

    }

    public static class OrderBuild {
        private int orderId;
        private String productName;
        private String consumerName;
        private int price;
        private int stock;

        public OrderBuild orderId(int orderId) {
            this.orderId = orderId;
            return this;
        }

        public OrderBuild productName(String productName) {
            this.productName = productName;
            return this;
        }

        public OrderBuild consumerName(String consumerName) {
            this.consumerName = consumerName;
            return this;
        }

        public OrderBuild price(int price) {
            this.price = price;
            return this;
        }

        public OrderBuild stock(int stock) {
            this.stock = stock;
            return this;
        }

        public Order build() {
            return new Order(orderId, productName, consumerName, price, stock);

        }

    }

}
