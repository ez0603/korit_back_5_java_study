package com.study.ch10;

public class RemoteController extends ElectronicDevice { // 클래스로 따로 정의 한 이유 - 틀이 있어야 계속 쓸 수 있기 때문

    @Override
    void showDeviceState() {
        System.out.println("리모컨의 상태를 확인합니다.");
    }
}
