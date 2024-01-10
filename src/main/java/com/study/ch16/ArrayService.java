package com.study.ch16;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ArrayService {
    private String[] strArray;

    public void add(String str) {
        String[] newArray = new String[strArray.length + 1]; // 함수가 호출될 때마다 새 배열을 만든다 기존것보다 1이 더많아야한다.
        for(int i =0; i < strArray.length; i++) {  // newArray로 돌리면 배열의 크기가 벗어나기때문에 strArray만큼 반복을 돌려준다
            newArray[i] = strArray[i];
        } // 옮겨줬기 때문에
        strArray = newArray; // 주소를 바꿔준다

        strArray[strArray.length -1] = str;  // 무조건 배열의 끝에 넣는다.

        // add함수가 호출될때마다 새로운 함수를 호출해서 옮겨줘야한다.
    }

    public void remove(int index) { // 기존보다 하나 적은 배열을 만들어서 삭제할것 빼고 전부 옮기기 지우는애를 기준으로 높은것은 -1 낮은것은 그대로
        // 기존보다 크기가 1작은 배열을 새로 만든다.
        // 매개변수로 받은 인덱스의 값을 기준으로 작은 index들은 그대로 옭기고 큰 인덱스들은 -1하여 옮긴다.
        // strArray의 배열을 새로운 배열로 바꾼다.
        String[] newArray = new String[strArray.length - 1];
        for (int i  = 0; i < newArray.length; i++) {
            newArray[i] = strArray[i < index ? i : i + 1]; // 인덱스보다 작은것들은 그대로, 작지않으면 +1

        }
        strArray = newArray;
    }

    public String get(int index) {
        return strArray[index];
    }

    public int indexOf(String str) { // 몇번째 인덱스에 있는지 찾아주는것(탐색기)
        if(str == null) {
            return -1;
        } // for문이 돌기 전 인덱스가 비어있는지 확인
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(str)) {
                return i; // 찾으면 i로 리턴
            }
        }
        return -1; // 찾지못하면 -1 리턴
    }

    @Override
    public String toString() {
            String result = "Array[";

            for (int i = 0; i < strArray.length; i++) {
                result += strArray[i];
                if (i < strArray.length - 1) {
                    result += ", ";
                }
            }

            result += " ]";

            return result;

    }
}
