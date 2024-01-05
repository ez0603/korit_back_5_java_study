package com.study.ch07.member;

import com.study.ch07.school.SchoolRepositer;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();

        String selectedMenu = null;



        while (true) { // 무한루프문에서는 switch보다는 if문 선호
            System.out.println("[[ 회원 관리 프로그램 ]]");
            System.out.println("1. 회원 등록");
            System.out.println("q. 프로그램 종료하기");

            System.out.print("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();

            if("1".equals(selectedMenu)) {
                boolean responseData = memberService.addMember();
                if(responseData) {
                    System.out.println("<<< 회원 등록 완료 >>>");
                } else {
                    System.out.println("<<< 회원 등록 취소 >>>");
                }
            } else if ("q".equalsIgnoreCase(selectedMenu)) { // equalsIgnoreCase 를 쓰면 대소문자 구분없이 가능
                break;
            } else {
                System.out.println("다시 선택하세요.");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println("<<<<<< 프로그램이 종료되었습니다. >>>>>>");

    }
}
