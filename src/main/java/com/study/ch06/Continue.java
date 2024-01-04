package com.study.ch06;

public class Continue {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) { // 짝수일때만 실행 -> 짝수일때만 'for문마지막' 출력
            System.out.println("i : " + i);
            if(i % 2 !=0) {
                continue; // 컨티뉴가 조건 충족 되면 실행 안함
            }
            System.out.println("for문 마지막");
        }
    }
}

//객체: 변수를 가질 수 있다
//      함수를 가질 수 있다
