package com.study.ch16;

import com.study.ch11.Phone;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
    // 만드는 순서 C(크리에이트) -> R -> D(딜리트) -> U(업데이트)
    // 1. 등록
    // 5. 전체조회
    // 4. 이름으로 조회
    // 6.
    // 2.
    // 3.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Member> members= new ArrayList<>();
        String selectedMenu = null;

        while (true) {
            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 이름 수정");
            System.out.println("3. 회원 주소 수정");
            System.out.println("4. 회원 이름으로 조회");
            System.out.println("5. 회원 전체 조회");
            System.out.println("6. 회원 삭제");
            System.out.println("q. 프로그램 종료 ");
            System.out.print("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();

            if("q".equalsIgnoreCase(selectedMenu)) {
                break;
            } else if ("1".equals(selectedMenu)) {
                /*
                [ 회원 등록하기 ]
                이름 >> 김준일
                주소 >> 부산 동래구
                << 등록이 완료되었습니다. >> -> 출력
                 */
                System.out.println("[ 회원 등록하기 ]");
                System.out.print("이름 >> ");
                String name = scanner.nextLine();
                System.out.print("주소 >> ");
                String address = scanner.nextLine();
                members.add(new Member(name, address));
                System.out.println(" << 등록이 완료되었습니다. >>");

            } else if ("2".equals(selectedMenu)) {
                /*
                [ 회원 이름 수정하기 ]
                수정 할 회원의 이름을 입력하세요 >> 김준일
                이름 >> 김준이
                << 수정이 완료되었습니다. >> -> 출력
                 */ // 대상을 선택하여 수정하기
            } else if ("3".equals(selectedMenu)) {
                /*
                [ 회원 이름 수정하기 ]
                수정 할 회원의 이름을 입력하세요 >> 김준이
                해당 이름의 회원이 존재하지 않습니다. -> 조회했을때 없으면
                주소 >> 부산 동래구 사직동
                << 수정이 완료되었습니다. >> -> 출력
                 */ // 대상을 선택하여 수정하기
            } else if ("4".equals(selectedMenu)) {
                /*
                [ 회원 이름으로 조회하기 ]
                조회 할 회원의 이름을 입력하세요 >> 김준이
                Member 객체 toString(); 호출
                << 조회가 완료되었습니다. >> -> 출력
                 */ // 대상을 선택하여 수정하기
                System.out.println("[ 회원 이름으로 조회하기 ]");
                System.out.print("조회 할 회원의 이름을 입력하세요 >> ");
                String name = scanner.nextLine();
                for(int i = 0; i < members.size(); i++) {
                    if (name.equals(members.get(i).getName())) {

                    }
                    System.out.println(members.toString());
                    System.out.println("<< 조회가 완료되었습니다. >>");
                } System.out.println("입력하신 회원은 존재하지 않습니다.");

                } else if ("5".equals(selectedMenu)) {
                /*
                [ 회원 전체 조회하기 ]
                MemberList 전체 반복 toString(); 호출
                << 조회가 완료되었습니다. >> -> 출력
                 */
                System.out.println(members.toString());

            } else if ("6".equals(selectedMenu)) {
                /*
                [ 회원 이름 삭제하기 ]
                수정 할 회원의 이름을 입력하세요 >> 김준이
                삭제 된 Member 객체 toString(); 호출
                << 삭제가 완료되었습니다. >> -> 출력
                 */ // 제네릭으로 remove 객체 조회
            } else {
                System.out.println("다시 선택하세요");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");

    }
}
