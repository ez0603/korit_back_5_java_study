package com.study.ch08;

public class TestA01 {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 20;
        int[] nums = new int[3];

        TestB01 bClass = new TestB01();
        bClass.add(nums, num, num2); // add를 실제로 호출해서 쓰고싶으면 new로 생성해줘야함
        bClass.showArrayDatas(nums);

        bClass.add(nums, 20, 40);
        bClass.showArrayDatas(nums);
    }
}
