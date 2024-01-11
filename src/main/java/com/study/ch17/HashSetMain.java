package com.study.ch17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class HashSetMain {

    public static void main(String[] args) {

        // HashSet 총 크기 16(0~15) %16 맥스사이즈를 벗어나면 새로운 HashSet이 생김 -> 생긴 후에는 정렬
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("김준일");
        nameList.add("김준이");
        nameList.add("김준이");
        nameList.add("김준이");

        System.out.println(nameList);

        HashSet<String> names = new HashSet<>(); // 순서관련 된건 없음
        names.addAll(nameList);

        System.out.println(names);

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names); // int index를 넣어주면 인덱스를 지정할 수 있다
//        newNameList.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) { //
//                return Objects.hash(o1) - Objects.hash(o2); // 정렬 정방향
//                return Objects.hash(o2) - Objects.hash(o1); // 정렬 역방향
//            } //
//        });
        System.out.println(newNameList.get(1));

        // set 은 하나씩 다 꺼내봐야하기 때문에 for문을 돌려준다
        // set은 데이터 꺼내는 용도로는 잘쓰지않는다.
        // set은 중복이 안됨 -> 데이터의 중복 제거로 자주 사용
        String findName = null;

        for(String name : names) {
            if(name.equals("김준삼")) {
                findName = name;
                break;
            }
        }
        System.out.println(findName);
    }
}
