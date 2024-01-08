package com.study.ch09;

public class SmartPhone extends ElectronicDevice { // 상속
    String model;
    String color;

    void call() {
        System.out.println("전화 연결을 시도합니다.");
    }

//    void showDeviceState() {
//        System.out.println("스마트폰 전원 상태 : " + ((powerState) ? "켜짐" : "꺼짐")); // true면 켜짐 false면 꺼짐
//    } // 오버라이드 (재정의) 상속된게 업캐스팅 이후에 호출

    @Override // ctrl + o / @로 시작하면 어노테이션 - 재정의된것을 구분(확인)하기 위해 쓰는것
    void showDeviceState() {
        super.showDeviceState();
    }
}
