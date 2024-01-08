package com.study.ch08.car;

public class CarRepository { // 데이터 저장소 데이터 관련된것이면 다 Repository 그 외의 로직은 Service
    // 추가 조회 수정 삭제 <- Repository
    final Car[] cars; // 무조건 있어야 하는 배열이기 때문에 final을 붙여준다.
                        // 외부(main)에서 만들어진 생성자를 가지고 와서
                        // 배열은 Repository 에서 해준다.
    CarRepository(Car[] cars) {
        this.cars = cars;
    }

//    int getEmptyCount() { // 차량 등록전 빈공간 확인 (레파지토리 repository)
//        int emptyCount = 0;
//
//        for (int i = 0; i <cars.length; i++) {
//            if (cars[i] == null) {
//                emptyCount++; // 1씩 증가시켜라
//            }
//        }
//        return emptyCount;
//    } getEmptyIndex 와 하는 일이 같음

    int getEmptyIndex() { // 차량 등록전 인덱스 빈공간 확인
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] == null) {
                return i; // return을 만나면 바로 빠져 나가서 break를 쓰지 않음
            }
        }
        return -1;
    }

    void insert(Car car) {
        cars[getEmptyIndex()] = car;
    }

    Car[] getCarDates() { // Car이 비어있지 않은 경우에 얼만큼 등록되어 있는지 확인
        int carCount = 0;
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] != null) {
                carCount++;
            }
        }

        Car[] newCars = new Car[carCount];
        int j = 0; //
        for (int i = 0; i < cars.length; i++) {
            if(cars[i] != null) {
                newCars[j] = cars[i];
                j++;
            }
        }
        return newCars; // 함수가 종료 됐음에도 휩 메모리에 남아서 소멸되지 않기 때문에 new를 선언해주는것
    }
}
