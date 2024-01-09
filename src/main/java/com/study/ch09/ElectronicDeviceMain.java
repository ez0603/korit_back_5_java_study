package com.study.ch09;

public class ElectronicDeviceMain {

    public static void main(String[] args) {
        //ElectronicDevice 부모, Computer SmartPhone - 자식
        //extends - 상속 -> 상속되면 합쳐진다
        //자식 클래스를 생성하면 부모클래스가 같은 묶음으로 동시에 생성된다
        //부모클래스에서 가지고있던 메소드를 자식클래스에서 재정의할 수 있다
        //재정의 - 부모의 메소드와 동일한 메소드 형태로 실행문만 다시 정의 할 수 있다
        //업캐스팅 - ElectronicDevice[] 배열에서 Computer SmartPhone를 업캐스팅해서 집어넣을수있다
        //
        //다운캐스팅 -
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

        for(int i = 0; i < electronicDevices.length; i++) { // electronicDevices안에 있는게 컴퓨터인지 스마트폰인지 알 수없기때문에 조건문으로 만들어준다.
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
