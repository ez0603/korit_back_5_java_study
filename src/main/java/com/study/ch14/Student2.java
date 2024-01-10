package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor // 필수args생성 / noArgs 동시 사용 X
public class Student2 {
    private final String name;
    private String address;
    @NonNull
    private String phone;

}
