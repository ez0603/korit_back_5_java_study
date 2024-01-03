package com.study.ch06;

public class For01 {
    public static void main(String[] args) {
//        for : 횟수가 정해져있고 반복횟수를 일정하게 증가시키면서 반복할 때 (조건중심X 반복횟수 중심)
//        while : 조건중심

        for(int i = 0; i < 10; i++) { // (초기화문(선언문); 조건문; 후처리문;) 10번 반복
            System.out.println("i : " + i); // 실행된 후 후처리문으로 감
        }

        int i = 0;
        while(i < 10) { // if문처럼 조건이 하나만 들어감
            System.out.println("i : " + i);
            i++;
        }
    }
}
