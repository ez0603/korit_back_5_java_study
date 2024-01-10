package com.study.ch15;

public class SendMain {

    public static void main(String[] args) {
        SendData<String> sendData1 = new SendData<>(200, "김준일");
//        send(sendData1); // 데이터 타입을 String으로 정의해준다. (항상 타입 명칭을 지정해준다. 앞에 정의되어 있으면 뒤에서는 생략이 가능하다.)
        SendData<Member> sendData2 = new SendData<>(200, new Member("김준일", "01099881916"));
        send(sendData2); //member 데이터의 toString 이 호출되어야함
        SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("김준이", "01011112222"));
        send(sendData3);
        // 제네릭 - 타입을 (T-타입 R-리턴 E-요소)로 정의해준뒤 타입(ex>String,클래스타입)을 정의해주면 여러 자료형을 같이 받을 수 있다.

    }

    public static void send(SendData<? super VipMember> sendData) { // ? = 제네릭의 와일드카드
        // <? extends Member> 와일드 카드에 extend를 걸면 상속제안으로, 상속을 받은 클래스만 호출이 가능하다. (위에서 밑으로)
        // <? super VipMember> VipMember와 부모까지 (밑에서 위로)
        // 이둘을 쓰지않으면 어떤 조건이던 상관없이 사용이 가능하다.
        sendData.send(); // 다른 자료형을 같이 받고싶을때 하나의 자료형으로는 다른 자료형을 불러오지 못하기 때문에 ? 를 써준다.
    }
}
