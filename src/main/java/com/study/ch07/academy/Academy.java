package com.study.ch07.academy;

public class Academy {
    String name;
    int age;
    String school;
    String grade;

    Academy(String name, int age, String school, String grade) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Academy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
