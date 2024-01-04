package com.study.ch07.school;

public class SchoolService {

    boolean isEmptyString(String str) {
        if(str == null) {
            return true;
        }
        return str.isBlank();
    }
    void SchoolService(School school) {
        SchoolRepositer schoolRepositer = new SchoolRepositer();

        System.out.println("서비스까지 데이터 전달 완료");

        schoolRepositer.saveSchool(school);
    }
}
