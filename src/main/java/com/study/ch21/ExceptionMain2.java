package com.study.ch21;

import java.util.ArrayList;
import java.util.List;

public class ExceptionMain2 {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("김준일");
        nameList.add("김준이");
        nameList.add(null);
        nameList.add("김준사");

        try {
            for(int i = 0; i < 5; i++) {
                String name = nameList.get(i);

                if (name.equals("김준사")) {
                    System.out.println("김준사를 찾음 !!");
                }
            }
        } catch (NullPointerException e){
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        } catch (Exception e) { // 예외처리할 때 마지막에 걸어주기(예상치 못한 예외처리를 예방하기위해)
            e.printStackTrace();
        } finally { // 예외가 터졌을때도 실행되는 조건
            System.out.println("이거는 무조건 실행됨");
        }


        System.out.println("프로그램 정상 종료");

    }
}
// 1. 컴파일 되기 전 오류 - 문법적인 오류
// 2. 실행 된 이후 오류(문법적인 오류는 없을때) 실행중 : RuntimeException
