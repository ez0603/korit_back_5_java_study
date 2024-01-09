package com.study.ch12.b;

import com.study.ch12.a.Student; // b에서 a에 있는걸 쓰려면 필요(public일때 가능)

public class BMain {

    public static void main(String[] args) {
        Student student = new Student();
        student.test();
    }
}
