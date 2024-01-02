package com.study.ch01;

public class PrintStudy {

    public static void main(String[] args) {
        System.out.println("\u0064");
        System.out.println("" + '김' + '준' + '일');
        System.out.println("나이: " + (10 + 20));
        // 0000 0000
        // 역슬래쉬 u = 유니코드
        // System.out.println('김' + '준' + '일'); -> 10진수, 숫자로 더해서 나옴
        // System.out.println( "김" + "준" + "일"); -> 김준일 출력
        // System.out.println("" + '김' + '준' + '일'); -> 김준일 출력 (문자열이 맨 앞에 있을 경우, 문자열이 우선순위가 높기 때문에 문자열로 출력)
        // System.out.println("" + 10 + 20); -> 1020 출력
        // char자료형 -> '2바이트'의 공간을 가지고 있다
    }
}
