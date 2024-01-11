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
    private static ArrayList<Member> members = new ArrayList<>();

    // static 으로 묶어서 빼주는 이유 : 중복되는 것들을 간단하게 줄이기 위해 (코드 간단하게 줄이기 위해)
    public static String inputSearchName(String label) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(label + " >> ");
        return scanner.nextLine();
    } // inputSearchName = 입력한 이름을 찾아준다

    public static Member findMemberByName(String name) {// members의 리스트가 Member안에 있기때문에 ArrayList를 매개변수로 넘겨주어야함
        // 하지만 static ArrayList<Member> members = new new ArrayList<>(); 로 생성해주었기때문에 매개변수에 쓰지 않아도됨
        for (Member member : members) {
            if (member.getName().equals(name)) { // 멤버안에 들어있는 이름을 가져온다
                return member; // 방금꺼낸 멤버의 이름이 내가 찾는 멤버의 이름과 일치하면
            } // member주소가 일치하면 빠져나오고
        }
        return null; // 아니면 null을 출력한다
    } // findMemberByName = 들어있는 이름의 주소를 찾아준다

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

            if ("q".equalsIgnoreCase(selectedMenu)) {
                break;

            } else if ("1".equals(selectedMenu)) {
                /*
                [ 회원 등록하기 ]
                이름 >> 김준일
                주소 >> 부산 동래구
                << 등록이 완료되었습니다. >> -> 출력
                 */
                String name = null;
                String address = null;
                System.out.println("[ 회원 등록하기 ]");
                System.out.print("이름 >> ");
                name = scanner.nextLine();
                System.out.print("주소 >> ");
                address = scanner.nextLine();

                Member member = new Member(name, address);
                members.add(member); // members에 member을 추가해준다.
                System.out.println(" << 등록이 완료되었습니다. >>");

            } else if ("2".equals(selectedMenu)) {
                /*
                [ 회원 이름 수정하기 ]
                수정 할 회원의 이름을 입력하세요 >> 김준일
                이름 >> 김준이
                << 수정이 완료되었습니다. >> -> 출력
                 */ // 대상을 선택하여 수정하기

                System.out.println("[ 회원 이름 수정하기 ]");
                String searchName = inputSearchName("수정 할 회원의 이름을 입력하세요"); // 위에있는 inputSearchName을 통해 입력한 값을 찾아준다.
                Member findMember = findMemberByName(searchName);
                if (findMember == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue;
                }
                System.out.print("이름 >>");
                String updateName = scanner.nextLine();
                findMember.setName(updateName); // 수정한 값을 다시 넣어준다.
                System.out.println("<< 수정이 완료되었습니다 >>");

            } else if ("3".equals(selectedMenu)) {
                /*
                [ 회원 이름 수정하기 ]
                수정 할 회원의 이름을 입력하세요 >> 김준이
                해당 이름의 회원이 존재하지 않습니다. -> 조회했을때 없으면
                주소 >> 부산 동래구 사직동
                << 수정이 완료되었습니다. >> -> 출력
                 */ // 대상을 선택하여 수정하기
                System.out.println("[ 회원 주소 수정하기 ]");
                String searchName = inputSearchName("수정 할 회원의 이름을 입력하세요");
                Member findMember = findMemberByName(searchName);
                if (findMember == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue;
                }
                System.out.print("주소 >>");
                String updateAddress = scanner.nextLine();
                findMember.setAddress(updateAddress);
                System.out.println("<< 수정이 완료되었습니다 >>");

            } else if ("4".equals(selectedMenu)) {
                /*
                [ 회원 이름으로 조회하기 ]
                조회 할 회원의 이름을 입력하세요 >> 김준이
                Member 객체 toString(); 호출
                << 조회가 완료되었습니다. >> -> 출력
                 */ // 대상을 선택하여 수정하기
                String searchName = null; // 변수하나 만들어서 초기화해주기
                System.out.println("[ 회원 이름으로 조회하기 ]");
                searchName = inputSearchName("조회 할 회원의 이름을 입력하세요 >> ");
//                System.out.print("조회 할 회원의 이름을 입력하세요 >> ");
//                searchName = scanner.nextLine(); // 위 문장 하나로 묶임 -> inputSearchName

                Member findMember = findMemberByName(searchName);
                if (findMember == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue;
                }
                System.out.println(findMember); // findMember이 null이 아니면 실행
                System.out.println("<< 조회가 완료되었습니다. >>");

            } else if ("5".equals(selectedMenu)) {
                /*
                [ 회원 전체 조회하기 ]
                MemberList 전체 반복 toString(); 호출
                << 조회가 완료되었습니다. >> -> 출력
                 */
                System.out.println("[ 회원 전체 조회하기 ]");
                for (Member member : members) {
                    System.out.println(member);
                }

            } else if ("6".equals(selectedMenu)) {
                /*
                [ 회원 이름 삭제하기 ]
                수정 할 회원의 이름을 입력하세요 >> 김준이
                삭제 된 Member 객체 toString(); 호출
                << 삭제가 완료되었습니다. >> -> 출력
                 */ // 제네릭으로 remove 객체 조회
                String searchName = null; // 변수하나 만들어서 초기화해주기
                System.out.println("[ 회원 이름으로 삭제하기 ]");
                System.out.print("삭제 할 회원의 이름을 입력하세요 >> ");
                searchName = scanner.nextLine();

                Member findMember = null;
                for (Member member : members) {
                    if (member.getName().equals(searchName)) { // 방금꺼낸 멤버의 이름이 내가 찾는 멤버의 이름과 일치하면
                        findMember = member; // 찾는 멤버 객체를 하나 만들어서 그 값을 대입해준다
                        break;
                         }
                    }
                    if (findMember == null) {
                        System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                        continue;
                    }
                    members.remove(findMember);
//                            members.remove(members.indexOf(findMember))
                    System.out.println(findMember); // findMember이 null이 아니면 실행
                    System.out.println("<< 조회가 완료되었습니다. >>");

                } else{
                    System.out.println("다시 선택하세요");
                }
                System.out.println();

            }
            System.out.println("프로그램 종료");
        }


}