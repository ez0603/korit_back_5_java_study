package com.study.ch16;

import java.util.ArrayList;

public class StrArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");

        System.out.println(strList);
        System.out.println(strList.get(1)); // 해당 리스트에 있는 인덱스 1번값을 가져와라
        System.out.println(strList.indexOf("c")); // c의 인덱스 값 찾기
        strList.remove(1);
        System.out.println(strList);
    }
}
