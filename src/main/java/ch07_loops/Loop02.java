package ch07_loops;
/*
    1 2 3 4 5 6 ... 10
    11 12 13 ... 20
    ...
    91 92 ... 100

    1. 반복문을 100번 돌리는 압법
    2. 반복문을 10번 돌리는 방법
 */

public class Loop02 {
    public static void main(String[] args) {
        int i = 0;
//        while (i < 10) {
//            System.out.print(++i + " ");
//        }
//        System.out.println();
//        while (i < 20) {
//            System.out.print(++i + " ");
//        }
//        System.out.println();
//        while (i < 30) {
//            System.out.print(++i + " ");
//        }
//        System.out.println();
//        while (i < 40) {
//            System.out.print(++i + " ");
//        }
//        System.out.println();
//        while (i < 50) {
//            System.out.print(++i + " ");
//        }
//        System.out.println();
//        while (i < 60) {
//            System.out.print(++i + " ");
//        }
//        System.out.println();
//        while (i < 70) {
//            System.out.print(++i + " ");
//        }
//        System.out.println();
//        while (i < 80) {
//            System.out.print(++i + " ");
//        }
//        System.out.println();
//        while (i < 90) {
//            System.out.print(++i + " ");
//        }
//        System.out.println();
//        while (i < 100) {
//            System.out.print(++i + " ");
//        }
        // 1번 풀이 방법
//        while (i < 100) {
//            System.out.print(++i + " ");
//            if(i % 10 == 0){
//                System.out.println();
//            }
//        }

        // 2번 풀이 방법
        int j = 1;
        while (j < 101) {
            System.out.println(j + " " + (j+1) + " " + (j+2) + " " + (j+3) + " " + (j+4) + " " + (j+5)
                    + " " + (j+6) + " " + (j+7) + " " + (j+8) + " " + (j+9));
            j+=10;
        }
    }

}
