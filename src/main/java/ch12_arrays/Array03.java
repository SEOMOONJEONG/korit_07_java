package ch12_arrays;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        /*
    실행 예
    몇 명의 학생을 등록하시겠습니까? >> 5
    1 번 학생의 이름을 등록하세요 >> 김일
    김일 학생의 점수를 등록하세요 >> 4.5
    2 번 학생의 이름을 등록하세요 >> 김이
    김이 학생의 점수를 등록하세요 >> 4.4
    3 번 학생의 이름을 등록하세요 >> 김삼
    김삼 학생의 점수를 등록하세요 >> 4.3
    4 번 학생의 이름을 등록하세요 >> 김사
    김사 학생의 점수를 등록하세요 >> 4.2
    5 번 학생의 이름을 등록하세요 >> 김오
    김오 학생의 점수를 등록하세요 >> 4.1

    김일  김이  김삼  김사  김오
    4.5   4.4   4.3   4.2   4.1
    학생들의 점수 총합은 21.5점 입니다.

    score name

 */
        Scanner scanner = new Scanner(System.in);

        int index = 0;
        double score;

        System.out.print("몇 명의 학생을 등록하시겠습니까? >> ");
        index = scanner.nextInt();
        scanner.nextLine(); //배리어

        String[] names = new String[index];
        double[] scores = new double[index];
        double sum = 0;

        for(int i = 0; i < names.length; i++) {
            System.out.print(i+1 + " 번 학생의 이름을 등록하세요. >> ");
            names[i] = scanner.nextLine();           // 이름 배열
            // 둘이 받는 배열 공간번호(장소번호(?))가 같음. 그래서 굳이 이중 for문 필요 없음
            // 반복문 하나당 하나를 입력받을 필요도 없음.
            System.out.print(names[i] + " 학생의 점수를 입력하세요. >> ");
            scores[i] = scanner.nextDouble();         // 점수 배열
            scanner.nextLine(); // 여기도 배리어
            sum += scores[i];
        }
        // 각 배열의 element를 출력하는 반복문 작성할 필요 → names 출력 후에 개행이 이루어지고 그 다음 scores가 출력
        for(int i = 0; i < names.length; i++){       // names[i] 출력 위해 반복문
            System.out.print(names[i] + "  ");       // 김일 김이 김삼 김사 김오
        }
        System.out.println();
        for(int i = 0; i < scores.length; i++){      // scores[i] 출력 위해 반복문
            System.out.print(scores[i] + "  ");      // 4.5  4.4  4.3  4.2  4.1
        }
        System.out.println();
        System.out.println("학생들의 점수 총합은 " + sum + "점 입니다.");

    }
}
