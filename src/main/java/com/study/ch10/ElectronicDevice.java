package com.study.ch10;

/*
*  [추상화] - 공톰점을 뽑아내는것
*  1. 추상 클래스 abstract class - 공톰점을 모아서 하나의 클래스를 만든것 / 생성할 수 없다 어떠한 클래스로 정의 내려야지만 생성 할 수 있다.
*       // 일반클래스와 비슷하다
*  2. 인터페이스 interface - 모든 메소드가 추상 메소드(일반 클래스 생성X)
*
*  추상화하는이유
*  : 표준화 시켜서 유지 보수가 쉬워진다.
* */
public abstract class ElectronicDevice {
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }

    void setPowerOff() {
        powerState = false;
    }

//    void showDeviceState() {
//        System.out.println("전원 상태 : " + ((powerState) ? "켜짐" : "꺼짐")); // 매번 정의해둘 필요없다.
//    }

    // 추상메소드 - 인터페이스와 추상 클래스에서만 사용 가능 / 반드시 사용하겠다, 무조건 재정의 해줘야함
    abstract void showDeviceState();

}
