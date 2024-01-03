package com.study.ch05;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

//                어떠한 값이 키워드와 연결이 된다 = switch
//                값이 들어가는 참과 거짓의 조건이 들어간다 = if

        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.print("번호선택 : ");
        num = scanner.nextInt();

        switch (num) { // 해당 케이스를 찾아 거기서부터 시작
            // 자료형을 맞춰줘야함
            case 0:
                System.out.println("0선택");
                break; // 0을 입력하면 0을 찾아 실행시키고 멈춤
            case 1:
                System.out.println("1선택");
                break;
            case 2:
                System.out.println("2선택");
                break;
            default: // else와 비슷한 역할
                System.out.println("오류");


        }

//        if ("0".equals(num)) {
//            System.out.println("0선택");{
//                else if("1".equals(num)) {
//                    System.out.println("1선택");
//                } else if ("2".equals(num)) {
//                    System.out.println("2선택");
//                } else {
//                    System.out.println("오류");
//                }
//            }

        }
    }
