package com.study.ch07.school;

import com.study.ch07.register.ProductService;

import java.util.Scanner;

public class SchoolMain {

    public static void main(String[] args) {

        SchoolService schoolService = new SchoolService();

        Scanner scanner = new Scanner(System.in);

        String studentname = null;
        int studentage = 0;
        int studentgrade = 0;

        System.out.println("학생 입력 프로그램");

        System.out.println("학생 이름 입력 >>> ");
        studentname = scanner.nextLine();
        if(SchoolService.isEmptyString(studentname))

        System.out.println("학생 나이 입력 >>> ");
        studentage = scanner.nextInt();

        System.out.println("학생 학년 입력 >>> ");
        studentgrade = scanner.nextInt();
        if(studentgrade > 10) {
            System.out.println("다시 입력해주세요.");

        }


    }
}
