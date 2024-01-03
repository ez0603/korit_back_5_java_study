package com.study.ch05;

public class If01 {
    public static void main(String[] args) {
        // 조건문
        int i = 2;

        if(i > 3) { // if가 참이면 실행됨
          System.out.println("i가 3보다 큽니다"); // if문은 참 또는 거짓으로만
            System.out.println("if문 종료");
        } else if(i == 3) { // else는 하나의 명령은 중괄호 생략 가능 if else 가 하나인 경우 else if 가능 단, if else 가 하나 이사이면 불가능
            System.out.println("i가 3입니다.");
        } else {
           System.out.println("i가 3보다 작습니다.");
        }




        String tempStr = i > 3 ? print("i가 3보다 큽니다") : ""; //println 은 값으로 쓰지 못한다

    }

    public static String print(String str) {
        System.out.println(str);
        return str;
    }

}
