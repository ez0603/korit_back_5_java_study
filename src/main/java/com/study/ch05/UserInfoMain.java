package com.study.ch05;

import java.util.Scanner;

public class UserInfoMain {
    public static void main(String[] args) {
        /*
         이름 : 김준일
         나이 : 31
         연락처 : 01099881916 -> 문자열 (0은 int로 안나옴)
         학년 : 4
         주소 : 부산
         */

        Scanner scanner = new Scanner(System.in);
        String name = null;
        int age = 0;
        String phone = null;
        int grade = 0;
        String address = null; // 변수를 쓰면 다 위로 올리기 , 빈값 넣어 초기화 시켜주기


//          내가 한 답
//        System.out.print("이름 : ");
//        String name = scanner.next();
//        System.out.print("나이 : ");
//        int age = scanner.nextInt();
//        System.out.print("연락처 : ");
//        String num = scanner.next();
//        System.out.print("학년 : ");
//        int grade = scanner.nextInt();
//        System.out.print("주소 : ");
//        String address = scanner.next();

        System.out.print("이름 : ");
        name = scanner.next();
        System.out.print("나이 : ");
        age = scanner.nextInt();
        System.out.print("연락처 : ");
        phone = scanner.next();
        System.out.print("학년 : ");
        grade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("주소 : ");
        address = scanner.nextLine();

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("연락처 : " + phone);
        System.out.println("학년 : " + grade);
        System.out.println("주소 : " + address);


        // 4사분면 input 만들기
        System.out.print("x 값 : ");
        int x = scanner.nextInt();
        System.out.print("y 값 : ");
        int y = scanner.nextInt();

        if (x == 0 || y ==0) {
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
    }
}
