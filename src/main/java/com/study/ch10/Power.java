package com.study.ch10;

public interface Power { // 인터페이스 = 다중상속 가능(추강 클래스는 불가능)
    // 하나의 객체에 여러개의 인터페이스 구현 가능
    String ERROR_CODE = "-9999"; // 인터페이스는 변수 선언이 불가능하다.
//     초기화를 했을때만 변수가 사용가능하기때문에 모든 변수가 상수이다
    void setPowerOn();
    void setPowerOff();

    default void test() { // default를 붙이면 일반 메소드 생성 가능

    }

}
