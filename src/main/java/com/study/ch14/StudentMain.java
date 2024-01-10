package com.study.ch14;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student("김준일", "01099881916", "동래구" , 31); //Allargs
        System.out.println(student);

        Student2 student2 = new Student2("name", "number");
        System.out.println(student2);      // final name = 재정의 불가능
        student2.setPhone("01012341234"); // null만 아니면 되서 set으로 재입력 가능
        System.out.println(student2);

    }
}
