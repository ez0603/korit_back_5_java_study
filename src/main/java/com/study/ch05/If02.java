package com.study.ch05;


import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {

        int x = 1;
        int y = 1;

        if (x == 0 || y == 0) {
            System.out.println("오류");
        } else if (x > 0 && y > 0) {
            System.out.println("1사분면");
        } else if (x < 0 && y > 0) {
            System.out.println("2사분면");
        } else if (x < 0 && y < 0) {
            System.out.println("3사분면");
        } else {
            System.out.println("4사분면");
        }

        /* if (x >0 && y > 0) {
            System.out.println("1사분면");
        } else if (y < 0) {
            System.out.println("4사분면");
        } else if (x < 0) {
            System.out.println("2사분면");
        } else if (x == 0 || y == 0){
            System.out.println("오류");
        } else {
            System.out.println("3사분면");
        } */


 //       input으로 4사분면 표현하기

//        Scanner scanner = new Scanner(System.in);
//        int x = 0;
//        int y = 0;
//
//        System.out.println("x와 y를 입력해주세요(띄어쓰기로 구분): ");
//        x = scanner.nextInt();
//        y = scanner.nextInt();
//
//        if (x == 0 || y == 0) {
//            System.out.println("오류");
//        } else if (x > 0 && y > 0) {
//            System.out.println("1사분면");
//        } else if (x < 0 && y > 0) {
//            System.out.println("2사분면");
//        } else if (x < 0 && y < 0) {
//            System.out.println("3사분면");
//        } else {
//            System.out.println("4사분면");
//        }
    }
}


