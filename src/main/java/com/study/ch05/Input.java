package com.study.ch05;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // import java.util.Scanner; 가 없으면 실행 X
        // ctrl + 스페이스 -> 변수명 지정

        System.out.print("타이틀 : ");
        String tittle = scanner.nextLine(); // next : 띄어쓰기를 입력의 중단으로 봄 띄어쓰기를 하고 싶을 땐 nextLine = 엔터가 입력됨
        // 버퍼에 엔터가 입력되어 nextLine 쓰려면 scanner.nextLine 한줄 추가해주기

        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("b : ");
        int b = scanner.nextInt();
        System.out.print("c : ");
        int c = scanner.nextInt();

        System.out.println(tittle + ": " + (a + b + c));

        //System.out.print("타이틀 : ");
        //scanner.nextLine();
        //String tittle = scanner.nextLine();
    }
}
