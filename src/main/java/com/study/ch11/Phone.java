package com.study.ch11;

public class Phone {
    static int autoCount = 0; // static은 생성하지 않아도 존재하는 메모리 new를해도 복사되지않는다
    int serialNumber;
    Company company;

    public Phone(Company company) { // 생성될때 20240000로 생성되는데 생성할때마다 자동증가
        autoCount++;
        this.serialNumber = 20240000;
        this.serialNumber += autoCount;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "serialNumber=" + serialNumber +
                ", company=" + company.toString() +
                '}';
    }
}
