package com.study.ch08;

import java.util.Scanner;

public class ArrayMain01 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

//        배열(Array) 자료구조 != 알고리즘
        int[] numArray; // 선언 ,int배열을 담을수 있는 메모리 공간 할당

        numArray = new int[3]; // 값(주소) 대입

        System.out.println(numArray);

        System.out.println(numArray[0]); // 아무것도 넣지 않았기때문에 0 출력

        numArray[0] = 10;
        System.out.println(numArray[0]);
        numArray[1] = 20;
        numArray[2] = 30;

        Scanner scanner = new Scanner(System.in);
        System.out.println("인덱스 : ");
        int index = scanner.nextInt();

        System.out.println(numArray[index]);


    }
}
