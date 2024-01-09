package com.study.ch13;

/*
*  Company 클래스를 싱클톤을 적용하여 구현하시오
* 1. 유일한 객체 하나만 만들어야 할 때
* 2.
* */

public class Company {
    private static Company instance; // 자기자신을 private static으로 생성해줌
    private String name; // 객체안에 생성되는 맴버

    private Company() {}

    public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
