package ch00_test03_2;

class Calculator {
    // TODO: 두 개의 int를 더하는 add 메서드를 작성하시오.
    public int addInt(int a, int b) {
        return a + b;
    }

    // TODO: 두 개의 double을 더하는 add 메서드를 작성하시오.
    public double addDouble(double a, double b) {
        return a + b;
    }
}

public class OverloadingCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // TODO: 5와 10을 더한 결과를 "정수 덧셈 결과: [결과]" 형식으로 출력하시오.
        int result1 = calc.addInt(5, 10);
        System.out.println("정수 덧셈 결과: " + result1);

        // TODO: 3.5와 2.5를 더한 결과를 "실수 덧셈 결과: [결과]" 형식으로 출력하시오.
        double result2 = calc.addDouble(3.5, 2.5);
        System.out.println("실수 덧셈 결과: " + result2);
    }
}
/*
    정수 덧셈 결과: 15
    실수 덧셈 결과: 6.0
 */