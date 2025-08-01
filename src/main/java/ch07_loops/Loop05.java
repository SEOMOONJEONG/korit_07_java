package ch07_loops;

import java.util.Scanner;

/*
    중첩 for문도 가능합니다.
    for (int i = 0; i < 100 ; i++) {
        반복실행문1-a
        for(int j = 0; j < 100; j++) {
            반복실행문2
        }
        반복실행문1-b
    }
    for문을 활용하여 1일차 1교시입니다. ~ 5일차 3교시입니다 까지 출력하시오.
    구구단 for문 활용하여 출력하시오.
 */
public class Loop05 {
    public static void main(String[] args) {
//        // 문제 1
//        int sum = 0;
//        for(int i = 1; i < 6 ; i++){
//            for(int j = 1; j < 4; j++){
//                sum += j;
//                System.out.println(i + "일차 " + j + "교시입니다.");
//            }
//        }
//
//        // 문제 2
//        int num = 0;
//        for(int i = 2; i < 10; i++){
//            for(int j = 1; j < 10; j++){
//                System.out.println(i + " x " + j + " = " + i * j);
//            }
//        }
        /*
            1 2 3 4 5 ... 10
            11 ... 20
            91 ... 100
         */
//         1번 풀이 방법
//        while (i < 100) {
//            System.out.print(++i + " ");
//            if(i % 10 == 0){
//                System.out.println();
//            }
//        }
//            for(int i = 1; i < 101 ; i++){
//                System.out.print(i +" ");
//                if(i % 10 == 0){
//                    System.out.println();
//                }
//            }

//        // 2번 풀이 방법
//        int j = 1;
//        while (j < 101) {
//            System.out.println(j + " " + (j+1) + " " + (j+2) + " " + (j+3) + " " + (j+4) + " " + (j+5)
//                    + " " + (j+6) + " " + (j+7) + " " + (j+8) + " " + (j+9));
//            j+=10;
//        }
//        System.out.println("------------------------------");
          // 틀린코드
//        for(int i = 1; i < 101; i++) { //11
//            System.out.println(i /*12*/ + " "+ (i+1) + " " + (i+2) + " " + (i+3) + " " + (i+4) + " " + (i+5)
//                    + " " + (i+6) + " " + (i+7) + " " + (i+8) + " " + (i+9)); // 9
//            i+=10;    // 10
//        }
//        for(int i = 1; i < 100; i++) {
//            System.out.println(i /*12*/ + " "+ (i+1) + " " + (i+2) + " " + (i+3) + " " + (i+4) + " " + (i+5)
//                    + " " + (i+6) + " " + (i+7) + " " + (i+8) + " " + (i+9)); // 9
//            i+=9;    // 10   //  i = i + 9
//        }
//        System.out.println("------------------------------");
//        for(int i = 1; i < 101; i+=10) {
//            System.out.println(i + " "+ (i+1) + " " + (i+2) + " " + (i+3) + " " + (i+4) + " " + (i+5)
//                    + " " + (i+6) + " " + (i+7) + " " + (i+8) + " " + (i+9));
//        }

        /*
            숫자를 입력받아서 n까지 더하는 반복문을 for문으로 작성하시오.
            실행 예
            1부터 몇까지 더하시겠습니까? >> 10
            1부터 10까지의 합은 55입니다.
            위에거 다 하신 분들은
            1부터 10까지의 숫자 중 짝수의 합도 도출하시오.
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("1부터 몇까지 더하시겠습니까? >> ");
//        int n = scanner.nextInt();
//        int sum = 0;
//        for(int i = 1; i < n+1; i++){
//            sum += i;
//        }
//        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
//
//        int sumEven = 0;
//        int sumOdd = 0;
//        for(int i = 1; i < n+1; i++) {
//            if (i % 2 == 0) {
//                sumEven += i;
//            } else {
//                sumOdd += i;
//            }
//        }
//        System.out.println("1부터 " + n + "까지 짝수의 합은 " + sumEven + "입니다.");
//        System.out.println("1부터 " + n + "까지 홀수의 합은 " + sumOdd + "입니다.");

//        for(int i = 1; i < n+1; i++){
//            if(i % 2 == 1) {
//                sumOdd += i;
//            }
//        }
//        System.out.println("1부터 " + n + "까지 홀수의 합은 " + sumOdd + "입니다.");



    }
}
