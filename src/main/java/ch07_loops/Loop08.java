package ch07_loops;
/*
         *
        **
       ***
      ****
     *****
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Loop08 {
    public static void main(String[] args) {
        // 개행을 책임지는 for문
        for(int i = 0; i < 6; i ++) {
            // 공백을 책임지는 for문 → 공백은 줄어들어야 함
            for(int j = 0; j < 6-i ; j++) {
                System.out.print(" ");
            }
            /*
                for(int j = 5; j > i; j--) {
                System.out.print(" ");
                }
             */
            // 별을 책임지는 for문 → 별은 늘어나야 함.
            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < 5; i++) {
            // 공백을 책임지는 for문 → 공백은 줄어들어야 함.
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // 별을 책임지는 for문 → 별은 늘어나야 함.
            for(int k = 0; k < 5-i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 줄의 별을 생성하시겠습니까? >> ");
        int row = scanner.nextInt();
        for(int i = 0; i < row + 1; i ++) {
            for(int j = 0; j < row -i ; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
