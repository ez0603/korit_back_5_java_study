package com.study.ch08.car;

import java.util.Scanner;

public class CarMain { // main -> service -> repository 순서 지키기(유지보수가 용이하기 위해)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null; // 메소드 안에서는 초기화를 해줘야함
        boolean loopFlag = true;
//        Car car1 = null; // 루프(while)를 돌면 초기화가 되기때문에 위로 빼준다
//        Car car2 = null; // 동일한 자료형을 묶어주기 위해서 배열을쓴다.
//        Car car3 = null; // 동일한 자료형을 묶어주기 위해서 배열을쓴다.
        Car[] cars = new Car[3]; // 위 세개를 묶어주기 위해서 배열을 쓴다.
        CarRepository carRepository = new CarRepository(cars); // 생성은 메인에서 해준다(결합도를 낮춰주기 위해서)
        CarService carService = new CarService(carRepository);
//        carService.carRepository = carRepository;  -> CarService에 넣어줌
//        carRepository.cars = cars; -> CarRepository에 넣어줌


        while (loopFlag) {
            System.out.println("자동차 관리 프로그램");
            System.out.println("1. 자동차 등록");
            System.out.println("2. 자동차 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();
            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램을 종료중...");
                loopFlag = false;

            } else if ("1".equals(selectedMenu)) {
                System.out.println("<<< 자동차 등록 페이지 >>>");
//                int emptyCount = 0; -> CarService 로 이동

                String model = null;
                String color = null;

//                for (int i = 0; i <cars.length; i++) { // 차량 등록전 빈공간 확인 (레파지토리 repository)
//                    if (cars[i] == null) {
//                        emptyCount++; // 1씩 증가시켜라
//                    }
//                } -> CarService -> CarRepository 로 이동

                if (carService.isFull()) { // 빈공간이 없다
                    System.out.println("더이상 등록할 수 없습니다.");
                    continue; // break가 아닌 contiue인 이유 : break를 쓰면 아예 while문 밖으로 나가기때문
                }

                System.out.print("모델명 >>> ");
                model = scanner.nextLine();
                System.out.print("색상 >>> ");
                color = scanner.nextLine();


                Car car = new Car(model, color); // entity - 정보를 담고 있는 클래스
                carService.append(car);

//                for (int i = 0; i < cars.length; i++) {
//                    if (cars[i] == null) { // 비어있는 인덱스 찾기
//                        cars[i] = car;
//                        break; // 찾았으면 멈추기 못찾으면 if문 다시 반복
//                    }
//                } // 밑에 주석과 동일함 -> CarService 로 이동

//                    int emptyIndex = 0;

//                    if(cars[i] == null) { // 비어있는 인덱스 찾기
//                        emptyIndex = i;
//                        break; // 찾았으면 멈추기 못찾으면 if문 다시 반복
//                    }
//                    System.out.println(cars[emptyIndex].toString());
//                }
//                    cars[i] = new Car(model, color);
//                    car.model = model;
//                    car.color = color; // 이 두가지를 압축해서 생성자로 선언해준다.

//                   System.out.println(cars[i].toString());

            } else if ("2".equals(selectedMenu)) {
                System.out.println("<<< 자동차 조회 페이지 >>>");
//                    for(int i = 0; i < cars.length; i++) {
//                        System.out.print("[" + i + "] > ");
//                        if (cars[i] == null) {
//                            System.out.println("X"); // null 이면 출력
//                            continue;
//                           }
//                            System.out.println(cars[i].toString()); // null이 아니면 출력
//                        }
                carService.printCarList();
            } else{
                System.out.println("다시 입력하세요.");
            }
        }
                System.out.println("프로그램이 종료되었습니다.");
    }
}

//  분리하는 기준
//  1. 비즈니스
//  2. 서비스
//  3. 레파지토리 (데이터 저장 관리)
