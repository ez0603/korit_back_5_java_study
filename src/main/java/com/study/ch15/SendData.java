package com.study.ch15;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public class SendData<T> { //<T> = Type 를 의미, 제네릭은 타입을 여러개 받을 수 있다.
    // 제네릭 타입으로 일반 자료형은 쓸 수 없다. 클래스타입, 참조자료형만 가능하다.
    private int code;
    private T data; // 제네릭 / 데이터 타입을 제네릭으로 설정하여 Main에서 타입 정의를 해준다.
    // 업캐스팅이 되어서 다운캐스팅 해줘야 쓸 수 있음 (다운캐스팅 안해도 될 상황이면 String Member 이 둘다 들어가는 Object를 써줘도 된다.)

    public void send() { // 매개변수의 자료형과 리턴에도 제네릭 타입으로 줄 수 있다.
        System.out.println("데이터 전송");
        System.out.println("code : " + code);
        System.out.println("data : " + data);
    }
}
