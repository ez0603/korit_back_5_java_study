package com.study.ch08.car;

public class CarService { // 데이터를 가지고 로직
    CarRepository carRepository;

    CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    boolean isFull() {
//        int emptyCount = 0;
//
//        for (int i = 0; i <cars.length; i++) { // 차량 등록전 빈공간 확인 (레파지토리 repository)
//            if (cars[i] == null) {
//                emptyCount++; // 1씩 증가시켜라
//            }
//        } main -> CarService -> CarRepository 로 이동 / getEmptyIndex 와 하는일이 같음
        return carRepository.getEmptyIndex() == -1; // 위 주석을 불러내는것 / -1 = 가득참
    }

    void append(Car car) {
//        for (int i = 0; i < cars.length; i++) {
//            if (cars[i] == null) { // 비어있는 인덱스 찾기
//                cars[i] = car;
//                break; // 찾았으면 멈추기 못찾으면 if문 다시 반복
//            }
//        } getEmptyIndex 로 하는일은 같지만 코드를 줄일 수 있음
        carRepository.insert(car);
    }

    void printCarList() {
        Car[] cars = carRepository.getCarDates();
        if (cars.length == 0) {
            System.out.println("등록된 차량이 없습니다.");
            return;
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }

}
