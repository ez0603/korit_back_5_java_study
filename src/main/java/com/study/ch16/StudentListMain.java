package com.study.ch16;

import java.util.ArrayList;

public class StudentListMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("김준일", 31));
        students.add(new Student("김준이", 32));
        students.add(new Student("김준삼", 33));
        students.add(new Student("김준사", 34));

        System.out.println(students);

        for (int i = 0; i < students.size(); i++) { // 리스트는 size 함수 호출 (인덱스가 있을때)
            Student student = students.get(i); // get(i)는 객체를 꺼내서
            student.setAge(students.get(i).getAge() + 1);
        } // 주소가 배열들 안에 들어있다

        // 향상된 for
        for(Student student : students) { //students = 리스트의 배열 / students -> student 0번째 인덱스에 대입 (인덱스가 없을때)
//      for(타입 변수명 : 배열 또는 컬렉션) 배열 또는 컬렉션에 저장된 값이 매 반복마다 하나씩 순서대로 읽어서 변수에 저장
            student.setAge(student.getAge() + 1);
        }

        System.out.println(students);

//        students.forEach(student -> student.setAge(student.getAge() + 1)); // 람다식 사용힌 forEach

        Student[] studentArray = new Student[4];
        for(int i = 0; i < studentArray.length; i++) {
            studentArray[i] = new Student("김준일", 31);
        }

//        Student[] studentArray = new Student[4];
//        for(int i = 0; i < studentArray.length; i++) {
//            Student student;
//            studentArray[i] = new Student("김준일", 31);
//        }
        for (Student student : studentArray) {
            student = new Student("김준일", 31);
        } // 배열의 주소가 아닌 배열안의 학생의 주소값을 꺼냈기때문에 null이 뜬다.
        // 배열에 넣는게 아닌 변수에 넣기 때문에 배열안에 값 자체를 넣으려면 이렇게 하면 안된다.

        int i = 0;
        for (Student student : studentArray) { // 값을 담기위한 임시 변수
            studentArray[i] = new Student("김준일", 31);
            i++;
        } // 향상된 for문으로는 값을 넣는 행위는 잘 하지않는다.

        for(Student student : studentArray) {

            System.out.println(student);
        }

//        students.get(0) = new Student("김준일" , 31); // 값에다가 값을 대입하는 행위/ 값을 넣을수 없다.
        students.set(0, new Student("김준일" , 31));
    }
}
