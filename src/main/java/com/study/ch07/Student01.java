package com.study.ch07;

public class Student01 {
    String name;
    int age;
//    String address;
    final String address;

    // 생성자 constructor
    // args(arguments) 매개변수 값

    // NoArgsConstructor - 매개변수를 가지고 있지 않다
//    Student01() { // final이 붙으면 쓰지 못한다. 다른 생성자가 하나라도 있으면 쓰지못한다.
//
//    }

    // AllArgsConstructor - 매개변수의 값을 다 가지고있다.
    Student01(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // RequiredArgsConstructor - 매개변수에 final 받아옴
    Student01(String address) {
        this.address = address;
    }
}
