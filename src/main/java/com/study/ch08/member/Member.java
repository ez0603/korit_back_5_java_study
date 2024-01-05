package com.study.ch08.member;

public class Member {
    String code;
    String name;
    int age;
    String address;

    Member(String code, String name, int age, String address) { // alt + ins Generate -> Constructor 하고 입력하고 싶은거 shift로 눌러 추가해서 ok 눌리기
        this.code = code;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
