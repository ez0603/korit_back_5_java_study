package com.study.ch12.a;

public class Student {
    private String name;
    private String address;

    public Student() {

    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) { // 변수명 앞에 set 붙이기
        this.name = name;
    }

    public String getName() { // 가지고 있는 값을 가지고 나가는것이기 때문에 매개변수 필요 없음
        return name;
    }

    public String getAddress() { // alt + ins 키로 getter,setter 만들기 가능
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void test() {
        System.out.println(add(10, 20));
        System.out.println(add(20, 30));
        System.out.println(add(40, 50));
    }

    private int add(int a, int b) {
        return a + b;
    }
}
