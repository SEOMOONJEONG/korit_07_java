package ch06_condition;
/*
    고민해봐야 할 사항
    Condition05의 코드는
    100 초과 / 0미만의 점수가 입력됐을 때 각각  A / F 라는 결과값이 나오게 됩니다.
    애초에 잘못된 점수를 입력했을 때 불가능한 점수 입력하라고 안내를 하려면 어떻게 할 수 있을까요?
    100 초과 / 0 미만의 경우 grade를 x라고 하겠습니다.

    참고사항 : 선수학습 하신 분들 중첩 if문을 사용하지 않고 작성하겠습니다.
 */
import java.util.Scanner;

public class Condition06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("점수를 입력하세요 >> ");
//        int score = scanner.nextInt();
//
//        if(score >= 90) {
//            System.out.println("당신의 점수는 " + score + "점이고, 학점은 A 입니다.");
//        } else if(score >= 80) {
//            System.out.println("당신의 점수는 " + score + "점이고, 학점은 B 입니다.");
//        } else if(score >= 70) {
//            System.out.println("당신의 점수는 " + score + "점이고, 학점은 C 입니다.");
//        } else if(score >= 60) {
//            System.out.println("당신의 점수는 " + score + "점이고, 학점은 D 입니다.");
//        } else if(score > 0 && score < 60) {
//            System.out.println("당신의 점수는 " + score + "점이고, 학점은 F 입니다.");
//        } else if(score > 100 || score < 0) {
//            System.out.println("불가능한 점수 입력입니다.");
//        }

        int score = scanner.nextInt();
        String grade = "";

        if(score >= 90) {
            grade = "A";
        } else if(score >= 80) {
            grade = "B";
        } else if(score >= 70) {
            grade = "C";
        } else if(score >= 60) {
            grade = "D";
        } else if(score > 0 && score < 60) {
            grade = "F";
        } else if(score < 0 || score > 100) {
            System.out.println("불가능한 점수 입력입니다.");
        }
        System.out.println("당신의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");
    }
}
