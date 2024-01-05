package com.study.ch07.academy;

import javax.print.DocFlavor;
import java.util.Scanner;

public class AcademyService {

    String inputValue(String label) {
        Scanner scanner = new Scanner(System.in);
        String value = null;
        while (true) {
            System.out.println("(입력 취소 : exit");
            value = scanner.nextLine();
            if(!value.isBlank()) {
                break;
            }
        }
        return value;
    }

    boolean addStudent() {
        String name = null;
        String age = null;
        String school = null;
        String grade = null;

        System.out.println(">>> 학생 등록 <<<");
        name = inputValue

    }
}
