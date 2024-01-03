package com.study.ch06;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;


        while (flag) { // (true)
            System.out.print("입력 : ");
            int inputValue = scanner.nextInt(); // falg가 false가 될 때까지 무한반복 (조건)

            System.out.println("입력한 번호 : " + inputValue);
            if(inputValue == 0) {
                System.out.println("프로그램을 종료합니다.");
               flag = false; // break;
            } else if(inputValue == 1) {
                System.out.println("1번으로 들어왔습니다.");
                boolean flag2 = true; // 이 선언을 안해주면 flag2가 false가 되기때문에 반복이 되지않는다.
                while (flag2) {
                    System.out.print("1번에서 입력 : ");
                    inputValue = scanner.nextInt();

                    System.out.println("입력한 번호 : " + inputValue);
                    if(inputValue == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        flag = false;
                        flag2 = false;
                    } else if(inputValue == -1) {
                        System.out.println("뒤로가기");
                        flag2 = false; // break는 안쪽 while문만 종료한다 바깥 while문은 종료되지 않음
                    } else if (inputValue == 1) {
                        System.out.println("1번에서 1번으로으로 들어왔습니다.");
                    } else if (inputValue == 2) {
                            System.out.println("1번에서 2번으로으로 들어왔습니다.");
                    } else {
                        System.out.println("다시 입력하세요.");
                    }
                }
            } else if (inputValue == 2) {
                System.out.println("2번으로 들어왔습니다.");
            } else {
                System.out.println("다시 입력하세요.");
            }
                System.out.println();

//            System.out.println("반복문 마지막에 출력"); true 일때는 이 문장이 출력 안되지만 flag를 사용하면 출력됨
        }
    }
}
