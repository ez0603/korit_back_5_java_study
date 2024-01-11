package com.study.ch18;

import com.study.ch11.Phone;
import com.study.ch13.A;

public class AdditionMain {
    public static void main(String[] args) {
        // 익명 클래스 -> 이름이 없을뿐 구현 되어있음
        Addition addition1 = new Addition() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        }; // ; 찍는이유 : {} 안에 들어가는게 값이기때문

        Addition  addition2 = new AdditionImpl();

        System.out.println(addition1.add(10, 20));
        System.out.println(addition1.add(30, 40));

        // 람다식
        // 람다식 핵심조건 -> 인터페이스 안에 딱 하나의 추상메소드만 정의되어 있어야 한다.
        // 단, 일반(default) 메소드는 여러개 정의되어 있어도 된다.
        Addition addition3 = (int a, int b) -> { // -> = add함수 명(추상메소드)
            System.out.println("람다식으로 구현한 add메소드");//if랑 특성이 똑같음
            return a + b;
        }; // 생성과 재정의가 동시에 된것
        //재정의 할때 내가 원하는 변수명을 쓸 수있다.

        System.out.println(addition3.add(50, 60));

        // 1. 람다식의 매개변수 자료형은 생략할 수 있다.
        Addition addition4 = (x, y) -> {
            return x + y;
        };

        // 2. 함수의 실행문이 하나의 명령문만 실행된다면 중괄호를 생략할 수 있다.
        // 단, return은 중괄호를 생략할 시에 같이 생략한다. 인터페이스에 이미 add가 있기때문ㄴ에
        Addition addition5 = (x , y) -> x + y;
        Viewer viewer1 = (viewData) -> {
            System.out.println("화면 출력");
        };
        Viewer viewer2 = (viewData) -> System.out.println("화면 출력");

        // 3. 매개변수가 1개면 매개변의수의 괄호를 생략할 수 있다.
        Viewer viewer3 = viewData -> System.out.println("화면출력");
    }
}
