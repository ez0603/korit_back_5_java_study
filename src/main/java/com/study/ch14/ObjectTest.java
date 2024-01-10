package com.study.ch14;
/*
    Object 클래스

 */

import java.util.Objects;
import java.util.Scanner;

public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "toString 메소드 테스트";
    }

//    @Override
//    public boolean equals(Object obj) { // 주소가 일치하는지 확인.
//        return super.equals(obj);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //주소 같으면 true
        if (o == null || getClass() != o.getClass()) return false;  // 자기자신확인. this 생략. object.getClass(서로 다른 객체)
                                                                    // 주소가 다른데 한쪽이 null
        ObjectTest that = (ObjectTest) o;                           // 모든객체는 object로 업캐스팅 가능 -> 다운캐스팅 대입
        return Objects.equals(name, that.name) && Objects.equals(address, that.address);
        // Object+s -> s가 붙으면 도구로 쓰이는 클래스. static method. 생성 없이 사용 가능
        // 2개의 문자열 비교 -> return true & false
        // 주소가 달라도 값이 같으면 같다.
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);     // 문자열(유니코드)->정수형 해쉬값
    }

}
