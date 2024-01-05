package com.study.ch08;

public class ArrayMain02 {
    public static void main(String[] args) {
        String[] names = new String[5]; // 배열의 크기는 무조건 지정해주어야한다.
        names[0] ="최수현";
        names[1] ="전주환";
        names[2] ="서창현";
        names[3] ="예홍렬";
        names[4] ="심재원";

        for(int i = 0; i < names.length; i++) { // names.length : 배열(자료형)의 크기
            System.out.println(names[i]);
        }

    }
}
