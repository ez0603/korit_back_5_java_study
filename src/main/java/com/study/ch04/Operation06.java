package com.study.ch04;

public class Operation06 {

    public static void main(String[] args) {

        /*
        << 문제 >>
        조건연산자 (삼항연산자)

        a > 0 ? "양수" : a == 0 ? "0" : "음수"
         */

        int iResult = 10 > 2 ? 1111 : 2222; // 결과 값의 자료형이 일치해야한다
        String sResult = 10 > 2 ? "1111" : "2222"; // 결과 값의 자료형이 일치해야한다
        Boolean bResult = 10 > 2;

//        String name = ""; 문자열은 비어있지만 값이 없는것은 아니다.(공백이라는 값이 들어있음)
        String name = null;
        System.out.println(name == null);

        System.out.println(iResult);

        String name2 = "김준일";
        String name3 = new String("김준일");
        System.out.println(name2 == name3);
        System.out.println(name2 == "김준일");
        System.out.println(name2 == "김준일");
        System.out.println("테스트 코드 작성");


    }
}
