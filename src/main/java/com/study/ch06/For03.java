package com.study.ch06;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("별 몇개 ? ");
        int starCount = scanner.nextInt();

        for(int i = 0; i < starCount; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*

        *
        **
        ***

        ***
        **
        *

          *  스페이스2번 별1개
         **  스페이스1번 별2개
        ***  스페이스0번 별3개

        ***
         **
          *

          *
         ***
        *****

         */

    }
}
