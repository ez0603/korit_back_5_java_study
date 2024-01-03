package com.study.ch05;

import java.util.Scanner;

public class Switch02 {
    public static boolean select() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("여기서 멈출까요 (y/n) ? ");
        String value = scanner.next();
        return "y".equals(value) || "Y".equals(value);
    }

    public static void main(String[] args) {  // 함수안에 함수 정의 불가능
//                함수를 쓰는이유
//                1. 중복제거
//                2. 기능별로 정리하기 위해
        int num = 1;

        System.out.println("게임 시작");
        switch (num) {
            case 1:
                System.out.println("1단계 시작");
                boolean result = select();
                if (select()) {
                    break;
                }
            case 2:
                System.out.println("2단계 시작");
                if (select()) {
                    break;
                }
            case 3:
                System.out.println("3단계 시작");
                if (select()) {
                    break;
                }
            case 4:
                System.out.println("4단계 시작");
                if (select()) {
                    break;
                }
            case 5:
                System.out.println("마지막단계 시작");
                if (select()) {
                    break;
                }
        }
    }
}
