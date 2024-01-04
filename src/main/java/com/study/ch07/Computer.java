package com.study.ch07;

public class Computer { // 클래스 안에 정의된 함수 = 메소드
    String type;
    String cpu;
    String ram;
    String disk;

//    생성자
//    1. 클래스의 이름과 동일하다.
//    2. 메소드의 형태이다.
    Computer() { // 생성자 , 주소값 리턴 (리턴자료형을 해줄 필요가 없는 이유)
        type = "컴퓨터";
    }

    Computer(String type) { // 예외적으로 클래스에서는 전역에서 사용한것을 지역에서도 사용할 수 있다.
        this.type = type;
    }

    void showInfo() {
        System.out.println("type : " + type);
        System.out.println("cpu : " + cpu);
        System.out.println("ram : " + ram);
        System.out.println("disk : " + disk);
    }
}
