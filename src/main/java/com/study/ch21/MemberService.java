package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public interface MemberService {

    public void printMemberList(ArrayList<Member> members) throws Exception;
    // throws Exception 예외처리 (강제성)
    // 모든 메소드에 예외처리를 해준다
    // 동작을 안해도 꺼지지 않고 프로그램을 종료해준다

}
