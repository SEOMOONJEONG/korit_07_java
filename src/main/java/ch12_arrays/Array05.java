package ch12_arrays;

import java.util.Scanner;

/*
    메서드를 정의해도 되고 main에 바로하셔도 상관없습니다.
    String[] scores 배열에
    A / B / C / D / F element를 입력하고
    실행 예
    A+ B+ C+ D+ F
    가 되도록 코드를 작성하시오.
 */
public class Array05 {

    public void printElements(String[] scores) {
        // 출력하는 반복문 → A B C D 만 출력하고 거기에 + 를 붙일 예정
        // 맨마지막 인덱스는 그냥 출력할 예정
//        for(int i = 0; i < scores.length-1; i++) {
//                System.out.print(scores[(i)]+"+ ");
//        }
//        System.out.print(scores[scores.length-1]);
        for (int i = 0; i < scores.length; i++) {
            if (scores.length - 1 == i) {
                System.out.print(scores[i]);
                return;
            }
            System.out.print(scores[i] + "+ ");
        }
    }
    public static void main (String[] args) {
        Array05 array05 = new Array05();
//       String[] scores = { "A", "B", "C", "D", "F" };
//       array05.printElements(scores);
        String[] scores = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print(i + 1 + " 번째 element 입력하세요. >> ");
            scores[i] = scanner.nextLine();
        }
        for (int i = 0; i < scores.length - 1; i++) {
            System.out.print(scores[i] + "+ ");
        }
        System.out.print(scores[scores.length - 1]);

    }
}

