package com.study.ch07.academy;

public class AcademyRepository {

    int Insert(Academy[] academies, Academy academy) {
        for(int i = 0; i < academies.length; i++) {
            if (academies[i] == null) {
                academies[i] = academy;
                break;

            }
        }
        System.out.println("저장소에 저장");
        System.out.println(academy.toString());
        return 1;
    }
}
