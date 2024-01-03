package com.study.ch03;

public class Function02 {


    public static void fx01() { // 매개변수 X, 리턴 X
        // void -> 비어있는, 공허한 (리턴이 없다)
        System.out.println("fx01 함수 실행");
        System.out.println();
    }

    public  static void  fx02(int age, String name) { // 매개변수 O, 리턴 X
        // 매개변수 안에서 쓰고 있는 함수는 쓸 수 없다.
        System.out.println("fx02 함수 실행");
        System.out.println("나이 :" + age);
        System.out.println("이름 :" + name);
        System.out.println();
    }

    // 오버로딩 : 함수명이 같더라도 매개변수의 자료형이 다르면 새로운 함수정의가 가능하다.
    public  static void  fx02(String name ,int age) { // 매개변수 O, 리턴 X
        // 변수명이랑 관계없이 자료형에 상관있다
        //그렇기 때문에 같은 이름의 함수라도 자료형 자리를 바꿔주면 사용할 수 있다
        // 매개변수 안에서 쓰고 있는 함수는 쓸 수 없다.
        System.out.println("fx02 함수 실행");
        System.out.println("이름 :" + name);
        System.out.println("나이 :" + age);
        System.out.println();
    }

    public static int fx03() { // 매개변수 X, 리턴 O
        // 매개변수가 없기 때문에 오버로딩이 안됨
        System.out.println("fx03 함수 실행");
        return 100;
    }

    public  static String fx04(String name, int age) { // 매개변수 O, 리턴 O
        return name + ", " + age;
    }

    public static void main(String[] args) {
        fx01();
        fx02(31, "김준일");
        fx02("김준이", 32);
        int num = fx03();
        System.out.println(fx03());
        String result = fx04("김준일", 31);
        System.out.println(result);
    }
}
