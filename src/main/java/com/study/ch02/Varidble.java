package com.study.ch02;

public class Varidble {
    public static void main(String[] args) {
        int date = 20231229;
        // date = 10 -> 대입
        // date의 값 -> 10
        // date의 주소 -> 300
        // date 안의 값의 주소 -> 100
        // &a -> a의 주소
        // 주소를 담을 수 있는 변수 = 포인트 변수
        double date2 = (double)date;
        int date3 = (int) date2;

        // 문자 -> 정수 -> 실수

        char a = '1';
        int b = a;
        double c = b;


        System.out.println(date + 1);
        System.out.println(date + 2);
        System.out.println(date + 3);
        System.out.println(date + 4);
        System.out.println(date + 5);
        System.out.println(date + 6);
        System.out.println(date + 7);
        System.out.println(date + 8);
        System.out.println(date + 9);

    }
}
