package com.study.ch15;

public class VipMember extends Member {
    private final String GRADE = "VIP";

    public VipMember(String name, String phone) {
        super(name, phone); // 부모의 생성자 호출 / AllArgsConstructor이기 때문에 무조건 호출해주어야 VipMember가 생성이됨.
    }
}
