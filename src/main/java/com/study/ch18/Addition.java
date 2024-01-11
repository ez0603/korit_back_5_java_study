package com.study.ch18;

@FunctionalInterface // 함수형 인터페이스(람다형)
// 람다식 전용 인터페이스에 달아준다.
public interface Addition {
    public int add(int x, int y);
}
