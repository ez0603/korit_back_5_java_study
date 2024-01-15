package com.study.exam05;

import java.util.*;

public class MapList {

    public static void main(String[] args) {

        List<Map<String, String>> customers = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("name","홍길동");
        map.put("rating","vip");
        map.put("age","30");
        customers.add(map);

        Map<String, String> map1 = new HashMap<>();
        map1.put("name","김기영");
        map1.put("rating","gold");
        map1.put("age","35");

        customers.add(map1);


        for (Map<String, String> customer : customers) {
            System.out.println(customer.get("name")+"");
            System.out.println(customer.get("rating"));
            System.out.println(customer.get("age"));


        }
    }
}
//name = 홍길동
//rating=vip
//age=30
//name=김기영
//rating=gold
//age=35
//
//