package com.study.ch11;

import com.study.ch02.ConstantMain;

public class FactoryMain {

    public static void main(String[] args) {
        Company company = new Company();
        company.setName("삼성");

        Phone phone1 = new Phone(company);
        Phone phone2 = new Phone(company);
        Phone phone3 = new Phone(company);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);



//        SamsungCompany samsungCompany = new SamsungCompany();
//          생성을 해야만 쓸 수 있는데 static을 쓰면 생성하지 않고 쓸 수 있다
//         생성을해도 새로운 데이터를 만드는 것이 아닌 공유하는것

    }
}
