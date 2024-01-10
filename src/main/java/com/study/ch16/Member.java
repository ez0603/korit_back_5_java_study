package com.study.ch16;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.print.DocFlavor;

@AllArgsConstructor
@Data
public class Member {
    private String name;
    private String address;


    @Override
    public String toString() {
        return " 회원 목록 [" +
                "이름 = '" + name + '\'' +
                ", 주소 = '" + address + '\'' +
                ']';
    }
}
