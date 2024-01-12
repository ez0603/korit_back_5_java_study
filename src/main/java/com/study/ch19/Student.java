package com.study.ch19;


import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class Student {
    private String name;
    private String address;
    private int age;

    public Student(String name, String address, int age) { // [ 4번으로 만들어줌
        this.name = name;
        this.address = address;
        this.age = age;
    } // ] 4번

    public static StudentBuilder builder() { // [ 2번으로 만들어줌
        return new StudentBuilder(); // ] 2번
    }


    public static class StudentBuilder { // [ 1번으로 만들어줌
        private String name;
        private String address;
        private int age; //] 1번


        public StudentBuilder name(String name) { // [ 3번으로 만들어줌
            this.name = name;
            return this; // ] 3번 // StudentBuilder에 자기자신을 저장해야하기때문에 return this
        }

        public StudentBuilder address(String address) { // [ 3번으로 만들어줌
            this.address = address;
            return this; // ] 3번 // StudentBuilder에 자기자신을 저장해야하기때문에 return this
        }

        public StudentBuilder age(int age) { // [ 3번으로 만들어줌
            this.age = age;
            return this; // ] 3번 // StudentBuilder에 자기자신을 저장해야하기때문에 return this
        }

        public Student build() { // [ 5번으로 만들어짐)
            return new Student(name, address, age);
        }

    }

}
