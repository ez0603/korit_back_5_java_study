package com.study.ch21;

public class ExceptionMain {

    public static void main(String[] args) {

        int[] numArray = new int[] {1,2,3,4,5}; // 배열생성 즉시 {1,2,3,4,5} 생성

        for(int i = 0; i < 6; i++) {
            try{ // 예외가 일어날 수 있는 코드
                System.out.println(numArray[i]);
            } catch ( ArrayIndexOutOfBoundsException e) {
                System.out.println("예외가 발생했다");
            }

        }

        System.out.println("프로그램 정상 종료");

    }
}
