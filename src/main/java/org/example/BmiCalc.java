package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BmiCalc {
    // call1() 형태로 메서드화 시키는게 그 다음 task 입니다.
    public void calCBmi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >> ");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >> ");
        double height = scanner.nextDouble() * 0.01;
        System.out.print("몸무게(kg)를 입력하세요 >> ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height*height);
        String bmigrade = "";
        if(bmi < 18.5) {
            bmigrade = "저체중";
        }else if (bmi < 23) {
            bmigrade = "정상체중";
        }else if (bmi < 25) {
            bmigrade = "과체중";
        }else if (bmi < 30) {
            bmigrade = "1단계 비만";
        }else if (bmi < 35) {
            bmigrade = "2단계 비만";
        }else if (bmi > 35) {
            bmigrade = "3단계 비만";
        }else {
            System.out.println("올바른 값을 입력해주세요.");
        }
        System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 " + bmigrade + "입니다.");

    }

    // call3() 형태로 메서드화 시킬겁니다.
    public void calCBmi(String name, double height, double weight) {
        // method 정의 할 때 argument와 parameter 개념을 혼란스러워 하는 경우가 있는데,
        // 정의 → 호출이라는 순서라고 생각할 때,
        // 소괄호 내에 있는 매개변수 목록들은 자료형 + (임의의) 변수명으로 이루어져
        // 있기 때문에 '선언'이라고 간주해주면 좋겠습니다.

        // call1() 유형에서 height를 scanner로 받았을 때, 바로 0.01을 곱해서
        // m 로 치환했었습니다.
        // 근데 우리는 double bmi로부터 긁어왔을 때, cm 기준일 수 도 있기 때문에
        // 추가 작업을 하겠습니다.
        height = height * 0.01;
        double bmi = weight / ((height)*(height));

        String bmigrade = "";
        if(bmi < 18.5) {
            bmigrade = "저체중";
        }else if (bmi < 23) {
            bmigrade = "정상체중";
        }else if (bmi < 25) {
            bmigrade = "과체중";
        }else if (bmi < 30) {
            bmigrade = "1단계 비만";
        }else if (bmi < 35) {
            bmigrade = "2단계 비만";
        }else if (bmi > 35) {
            bmigrade = "3단계 비만";
        }else {
            System.out.println("올바른 값을 입력해주세요.");
        }
        System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 " + bmigrade + "입니다.");

    }
    // call3() 형태 메서드기는 한데 매개변수가 객체인 경우
    public void calCBmi(Person person) {
        // Person class의 각 feild들에 private을 적용했기 때문에 값을 불러오기 위해서는
        // Getter를 사용해야만 합니다. 하지만 너무 코드가 길어지기 때문에
        // 지역변수들을 선언하고 그기에 값을 대입하여 사용하도록 하겠습니다.
//        double height = person.getHeight() * 0.01;

        // 그러면 여기부터는 위의 코드를 복사할 수 있습니다.
//        double bmi = person.getWeight() / ((height)*(height));
//
//        String bmigrade = "";
//        if(bmi < 18.5) {
//            bmigrade = "저체중";
//        }else if (bmi < 23) {
//            bmigrade = "정상체중";
//        }else if (bmi < 25) {
//            bmigrade = "과체중";
//        }else if (bmi < 30) {
//            bmigrade = "1단계 비만";
//        }else if (bmi < 35) {
//            bmigrade = "2단계 비만";
//        }else if (bmi > 35) {
//            bmigrade = "3단계 비만";
//        }else {
//            System.out.println("올바른 값을 입력해주세요.");
//        }
//        System.out.println(person.getName() + "님의 BMI 지수는 " + bmi + "으로 " + bmigrade + "입니다.");

        String name = person.getName();
        double height = person.getHeight() * 0.01;
        double weight = person.getWeight();

        // 그러면 여기부터는 위의 코드를 복사할 수 있습니다.
        double bmi = weight / ((height)*(height));

        String bmigrade = "";
        if(bmi < 18.5) {
            bmigrade = "저체중";
        }else if (bmi < 23) {
            bmigrade = "정상체중";
        }else if (bmi < 25) {
            bmigrade = "과체중";
        }else if (bmi < 30) {
            bmigrade = "1단계 비만";
        }else if (bmi < 35) {
            bmigrade = "2단계 비만";
        }else if (bmi > 35) {
            bmigrade = "3단계 비만";
        }else {
            System.out.println("올바른 값을 입력해주세요.");
        }
        System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 " + bmigrade + "입니다.");

    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >> ");
//        String name = scanner.nextLine();
//        System.out.print("키(cm)를 입력하세요 >> ");
//        double height = scanner.nextDouble() * 0.01;
//        System.out.print("몸무게(kg)를 입력하세요 >> ");
//        double weight = scanner.nextDouble();
//        /*
//            실행 예
//            이름을 입력하세요 >> 김일
//            키(cm)를 입력하세요 >> 172
//            몸무게(kg)를 입력하세요 >> 68
//            김일 님의 BMI 지수는 23.0으로 과체중입니다.
//
//            체중(kg) ÷ {신장(m) × 신장(m)}
//         */
//
//        double bmi = weight / (height*height);
//        String bmigrade = "";
//        if(bmi < 18.5) {
//            bmigrade = "저체중";
//        }else if (bmi < 23) {
//            bmigrade = "정상체중";
//        }else if (bmi < 25) {
//            bmigrade = "과체중";
//        }else if (bmi < 30) {
//            bmigrade = "1단계 비만";
//        }else if (bmi < 35) {
//            bmigrade = "2단계 비만";
//        }else if (bmi > 35) {
//            bmigrade = "3단계 비만";
//        }else {
//            System.out.println("올바른 값을 입력해주세요.");
//        }
//        System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 " + bmigrade + "입니다.");

        // call1() 유형으로 작성했기 떄문에 객체 생성
        BmiCalc bmiCalc = new BmiCalc();
//        bmiCalc.calCBmi();
//
//        System.out.println("------call3()-1 검증부분------");
//        bmiCalc.calCBmi("김이", 172, 68);
//        System.out.println("-------scanner 사용-------");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("이름을 입력하세요 >> ");
//        String name3 = scanner.nextLine();
//        System.out.println("키(cm)를 입력하세요 >>");
//        double height3 = scanner.nextDouble();
//        System.out.println("몸무게(kg)를 입력하세요 >>");
//        double weight3 = scanner.nextDouble();
//
//        bmiCalc.calCBmi(name3, height3, weight3);
//
//        // 여기에 Person 객체를 생성해야하는데, 일반적인 방식이 아니라
//        // Builder 패턴을 적용한 방식으로 생성해서
//        // calcBmi() 메서드의 argument로 집어넣어줘야합니다.
//
//        System.out.println("-----객체 생성 후 call3() 활용 방법-----");
//        // 1. Person 객체 생성
//        // 1-1. 원래 객체 생성 방법
//        Person person4 = new Person("김사", 172, 68);
//        System.out.println(person4);
//        // 1-2. Builder 패턴 사용 객체 생성 방법
//        Person person5 = Person.builder().name("김오").height(172).weight(68).build();
//
//        bmiCalc.calCBmi(person5);
//
//
//        Person person1 = Person.builder()
//                .name("김일")
//                .height(172)
//                .weight(68)
//                .build();

        System.out.println("---Scanner에 객체 사용 예시---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요 >> ");
        String name6 = scanner.nextLine();
        System.out.println("키(cm)를 입력하세요 >> ");
        double height6 = scanner.nextDouble();
        System.out.println("몸무게(kg)를 입력하세요 >> ");
        double weight6 = scanner.nextDouble();
        Person person6 = Person.builder()
                .weight(weight6)
                .name(name6)
                .height(height6)
                .build();

        bmiCalc.calCBmi(person6);


    }



}
