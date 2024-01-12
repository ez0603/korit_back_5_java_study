package com.study.ch19;

import com.study.ch13.C;
import lombok.Builder;
import lombok.ToString;
import lombok.experimental.Tolerate;

import javax.swing.*;

@Builder // 리스트 생성해서 값까지 넣어주는것을 만드는것
@ToString
public class Car {
    private String model;
    private String color;

    public Car(String model, String color) { // Car에서 호출되어야하기때문에 생성자를 만들어줌
        this.model = model;
        this.color = color;
    }

    public  static CarBuilder builder() { //CarBuilder class를 만들어준다
        return new CarBuilder(); // 객체
//        Car car = new Car(); 스태틱이 없으면 Car을 생성해줘야 사용가능
//        return new Car.CarBuilder();
    }

    public static class CarBuilder { // 내부 클래스
        private String model; //
        private String color; //
        //객체안에 메소드가 있어야 호출가능
        // 스태틱이 아니면
        // 스태틱 -> 스태틱 호출이기때문에 생성해줄 필요가 없음
        public Car build() {
            return new Car(model, color);
        }

        public CarBuilder model(String model) { // 호출될때 매개변수를 받아온다
            this.model = model; // this를 쓰는이유 : 객체참조
            return this; // CarBuilder 객체주소에 리턴
        }

        public CarBuilder color(String color) { // 호출될때 매개변수를 받아온다
            this.color = color;
            return this;
        }
    }
}
