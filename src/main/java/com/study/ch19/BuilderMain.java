package com.study.ch19;

public class BuilderMain {

    public static void main(String[] args) {
        Car.CarBuilder carBuilder = Car.builder(); //Car 클래스 안에 CarBuilder 클래스가 있는 CarBuilder = 생성자 호출 ,Car.builder() = 주소
        Car car2 = carBuilder.build(); // Car객체를 new

        Car car = Car.builder().model("아반떼").color("블랙").build(); // builder = 스테틱 메소드로 정의 (생성없이 가능)
        // new Car이 리턴되어야함
        // 클래스에서 . 찍어서 호출가능 = 스테틱 메소드



        System.out.println(car);


    }
}
