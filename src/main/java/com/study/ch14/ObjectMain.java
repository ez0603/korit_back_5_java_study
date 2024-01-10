package com.study.ch14;

public class ObjectMain {
    public static void main(String[] args) {

        ObjectTest objectTest = new ObjectTest("김준일", "동래구");
        System.out.println(objectTest.toString());
        System.out.println(objectTest); //toString 자동 호출

        ObjectTest objectTest1 = new ObjectTest("김준일", "동래구");
        System.out.println(objectTest.equals(objectTest1)); // 주소 다름. 다른 객체.
        System.out.println(objectTest == objectTest1);      // equals 와 같은 기능.
        // equals 로 확인한 값 일치 true / ==로 확인한 주소 비교 false

        System.out.println("----------");

        System.out.println(objectTest.getClass());
        System.out.println(objectTest1.getClass());  //
        System.out.println(ObjectTest.class);        // static 접근

        System.out.println(objectTest.hashCode());  // hashCode = 실제 메로리 주소
        System.out.println(objectTest1.hashCode()); // Integer.toHexString(hashCode() = 정수->십육진수->십진수
                                                    // 주소값 비교 = 오버라이드 후 일치(값 일치)

    }
}
