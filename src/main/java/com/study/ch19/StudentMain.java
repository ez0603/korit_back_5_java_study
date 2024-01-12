package com.study.ch19;

public class StudentMain {

    public static void main(String[] args) {
        Student.StudentBuilder studentBuilder = Student.builder();
        Student student2 = studentBuilder.build();

        Student student = Student.builder()
                .name("이지언")
                .age(25)
                .address("부산")
                .build();

        System.out.println(student);
    }
}
