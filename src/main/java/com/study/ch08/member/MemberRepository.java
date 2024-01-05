package com.study.ch08.member;

public class MemberRepository {

    int insert(Member[] members, Member member) {
        for(int i = 0; i < members.length; i++){
            if(members[i] == null) {
                members[i] = member;
                break; // break를 해줘야 한번만 입력하고 나머지 공간이 비워져있음
            }
        }
        System.out.println("저장소에 Member 저장");
        System.out.println(member.toString());
        return 1;

    }
}
