package com.study.ch07.academy;

import java.util.Scanner;

public class AcademyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AcademyService academyService = new AcademyService;
        Academy[] academies = new Academy[10];

        String selectMenu = null;

        while (true) {
            System.out.println(">>> 학원 수강생 관리 프로그램 <<<");
            System.out.println(">>> 1. 학생 등록 <<<");
            System.out.println(">>> 2. 학생 조회 <<<");
            System.out.println(">>> q. 프로그램 종료 <<<");

            System.out.println(">>> 메뉴 선택 <<<");
            selectMenu = scanner.nextLine();

            if("1.".equals(selectMenu));{
                int emptyCount = 0;
                for(int i = 0; i < academies.length; i++) {
                    if(academies[i] == null) {
                        emptyCount++;
                    } if(emptyCount == 0){
                        System.out.println("등록할 수 없습니다.");
                        continue;
                    }
                }
                if(emptyCount > 0) {
                    boolean responseDate = academyService.addStudent(academies);

                }
            }
        }

    }
}
