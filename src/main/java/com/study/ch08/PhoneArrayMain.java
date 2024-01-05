package com.study.ch08;

public class PhoneArrayMain {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3]; // phone 객체를 담을수 있는공간 값X(객체가 만들어진게 아님)
        phones[0] = new Phone("삼성", "갤럭시");
        phones[1] = new Phone("애플", "아이폰");
        phones[2] = new Phone("샤오미", "miPhone");

        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].toString());
        }
    }
}
