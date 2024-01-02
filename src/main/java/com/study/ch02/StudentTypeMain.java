package com.study.ch02;

public class StudentTypeMain{
    public static void main(String[] args) {

        StudentType junil = new StudentType();
        junil.name = "김준일";
        junil.studentYear = 1;
        junil.address = "부산동래구";

        System.out.println("이름 : " + junil.name);
        System.out.println("학년 : " + junil.studentYear + "학년");
        System.out.println("이름 : " + junil.address);

        int a = 10;
        double b = a;

        Person p = junil;
        StudentType junil2 =(StudentType) p;

//        Person 전주환 = new Person();
//        StudentType 전주환학생 =(StudentType) 전주환; -> 안됨

        StudentType 전주환학생 = new StudentType();
        Person 전주환사람 = 전주환학생;
        StudentType 전주환학생2 =(StudentType) 전주환사람;

    }


}
