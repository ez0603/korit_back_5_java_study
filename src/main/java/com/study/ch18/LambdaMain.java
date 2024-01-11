package com.study.ch18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {
        // 기본함수형 인터페이스
        // 1. java.lang.Runnable
        Runnable start = () -> { // 매개변수가 없을때는 괄호 생략 불가능
            System.out.println("프로그램을 실행합니다");
            System.out.println("데이터를 초기화 합니다");
            int a = 10;
            int b = 20;
            System.out.println("a + b = " + (a + b));
        }; // 함수안에서 함수 정의 불가능 / 람다식에서는 함수안에서 함수 정의 가능

        start.run();

        // 2. Supplier<T>
        Supplier<Integer> supplier1 = () -> 10; // 리턴생략 Supplier -> gat함수 생략 되어있음

        int a = supplier1.get();

        Supplier<Scanner> scannerInstance = () -> new Scanner(System.in); // 리턴 타입에 스캐너 객체를 넣어줘야한다.
//        scannerInstance.get().nextLine();

        // 3. Consumer<T>
        Consumer<String> setName = name -> {
            String newName = name + "님";
            System.out.println(newName);
        };

        setName.accept("김준일");

        // 리스트.forEach(s -> sout(s))
        // (s -> sout(s)) = Comsumer객체

        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");

        Consumer<String> action = str -> System.out.println(str);
        // action = 변수명, Consumer = 자료형, str -> System.out.println(str) = 객체
        action.accept("김준일"); // action을 호출하려면 .accept

        strList.forEach(str -> System.out.println(str)); // 실행X 호출은 따로 이루어져야함
        // Consumer을 정의해서 넣어주면 반복

        // 4. Function<T, R>
        Function<Integer, String> fx1 = num -> Integer.toString(num * num); //Integer로 들어가고 String으로 나옴 제네릭 2개 매개변수1개

        String result = fx1.apply(10);
        System.out.println(result);

        String result2 = fx1.andThen(num -> { // andThen을 쓰면 순서대로 동작 할 수 있게 만듦
            System.out.println("andThen에 넣은 함수" + num);
            return "문자열" + num;
        }).apply(10);

        System.out.println(result2);

        // 5. Predicate<T> 리턴자료형이 boolean 고정, (필터)조건에 맞는것만 리스트로 따로 빼줌
        Predicate<Integer> filterFx = num -> num % 2 == 0; // 조건

        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            numList.add(i + 1);
        }
        System.out.println(numList);

        List<Integer> newList = numList.stream().filter(filterFx).collect(Collectors.toList());
        System.out.println(newList); // 리스트를 stream공간에 담는다(카피한다)
        // 하나를 더 복사하여 filterFx와 맞는 조건의 값만 newList에 넣어준다.
        // toList를 해줌으로써 스트림을 리스트 형태로 바꿔준다.
        // filter = 걸러준 다음 넣어줌

        List<Integer> newList2 = numList.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println(newList2); // map = function, 기존의 num에 *2 를 해줘서 newList2에 다시 담아줌
        // map = 가공해서 다시 넣어줌


    }
}
