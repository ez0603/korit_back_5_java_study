package com.study.ch16;

public class ArrayMain {
    public static void main(String[] args) {
        String[] initStrArray = new String[0];
        ArrayService arrayService = new ArrayService(initStrArray);
        arrayService.add("김준일");
        arrayService.add("김준이");
        arrayService.add("김준삼");
        arrayService.add("김준사");
        arrayService.add("김준오");

        System.out.println(arrayService.toString());

        System.out.println(arrayService.indexOf("김준삼")); // 김준삼이 몇번째 인덱스에 들어가있는지 출력
    }
}
