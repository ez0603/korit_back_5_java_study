package com.study.ch09;

public class Computer extends ElectronicDevice { // 상속

    String cpu;
    int ram;

    void playGame() {
        System.out.println("PC 게임을 합니다.");
    }

    void showDeviceState() {
//        System.out.println("컴퓨터 전원 상태 : " + ((powerState) ? "켜짐" : "꺼짐")); // true면 켜짐 false면 꺼짐
        System.out.print("컴퓨터");
        super.showDeviceState(); // super. = 부모의 주소를 호출
    } // 오버라이드 (재정의) 상속된게 업캐스팅 이후에 호출
}
