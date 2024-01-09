package com.study.ch10;

public class ElectronicDeviceMain {

    public static void main(String[] args) {

        //익명클래스 - 상속을하자마자 구현하고 즉시 생성 / 일회용틀 /
        ElectronicDevice electronicDevice = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("첫번째 기기 확인");
            }
        }; //abstract class 라 생성 불가능 / 하지만 형태만 완성되면 생성 할 수 있다

        ElectronicDevice electronicDevice2 = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("두번째 기기 확인");
            }
        };

        RemoteController remoteController = new RemoteController(); // 그냥 클래스는 생성 가능

        ElectronicDevice[] electronicDevices = new ElectronicDevice[3]; // ElectronicDevice를 상속받아 구현 가능
        electronicDevices[0] = electronicDevice;
        electronicDevices[1] = electronicDevice2;
        electronicDevices[2] = remoteController; // 업캐스팅

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }
    }
}
