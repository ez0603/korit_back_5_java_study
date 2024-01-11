package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // map = key값으로 value를 꺼낼수있다
        // key값 = 중복 X , value = 중복가능

        map.put("1번학생", "김준일");
        map.put("2번학생", "김준일");
        map.put("3번학생", "김준일");
        map.put("4번학생", "김준일");
        System.out.println(map);
        System.out.println(map.get("3번학생"));//key값이 있기때문에 get 가능

        // 실전예시
        map.put("username", "junil");
        map.put("password", "1234");
        map.put("name", "김준일");
        map.put("email", "skhil1218@kakao.com");
        System.out.println(map.get("email"));


    }
}

