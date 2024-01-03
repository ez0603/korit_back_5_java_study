package com.study.ch06;

public class For02 {
    public static void main(String[] args) {
        /*
        0, 1, 2, 3, 4

        0, 1, 2, 3, 4
        5, 6, 7, 8, 9


         */
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            if (i % 5 != 4) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            if (i % 5 != 4) { // 나머지 값이 4가 아닐때 , 를 찍어라
                System.out.print(", ");
            }
            if (i % 5 == 4) { // 나머지 값이 4일때 줄바꿈을 하여라
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
        int n = 5;

        for (int i = 0; i < n; i++) {
            int rv_i = n - 1 - i; // -1을 안해주면 5부터 출력
            System.out.print(rv_i);
            if (rv_i % 5 != 0) {
                System.out.print(", ");
            }
            if (rv_i % 5 == 0) {
                System.out.println();
            }
        }
    }
}