package com.study.ch09;

public class ElectronicDeviceMain {

    public static void main(String[] args) {
        ElectronicDevice[] electronicDevices = new ElectronicDevice[10];

        for (int i = 0; i < electronicDevices.length; i++){
            electronicDevices[i] = i % 2 == 0 ? new Computer() : new SmartPhone();
        } // 생성되었을때 i를 2로 나누었을때 짝수면 computer 홀수면 smartphone에 집어넣음

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

        System.out.println();

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].setPowerOn();
        }

        System.out.println();

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

        for(int i = 0; i < electronicDevices.length; i++) {
            if(electronicDevices[i] instanceof Computer) { // 업캐스팅을 하기전 원래 뭔지 확인 instence = 생성된 객체
                Computer computer = (Computer)electronicDevices[i]; // 컴퓨터로 다운캐스팅
                computer.playGame();
            } else if (electronicDevices[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) electronicDevices[i];
                smartPhone.call();
            }
        }
    }
}
