package ch15_casting.animals;

import ch10_getter_setter.Person;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); // dog1 = 진또배기
        dog1.makeSound();
        dog1.fetch();

        // 클래스 객체 = 객체;
        Animal animal1 = dog1;  // 업캐스팅 # 1  animal ⊃ dog   // animal1이 dog1랑 == 했다. 근데 dog 고유의거는 못갖다씀
        // animal1 = 가짜 자식 (부모가 자식인척함) 근데 진짜 흉내는 못냄

        // 개가 짖습니다.
        // 강아지가 공을 물어옵니다.

        // 예시
        int a = 1;
        System.out.println(a);  // 1
        System.out.println(1);  // 1
        System.out.println("Animal animal1 = dog1;");
        System.out.print("dog1.makeSound() : ");    //개가 짖습니다.
        dog1.makeSound();
        System.out.print("dog1.fetch() : ");    // 강아지가 공을 물어옵니다.
        dog1.fetch();

        System.out.print("animal1.makeSound() : ");     // 개가 짖습니다.
        animal1.makeSound();      // 결과값 : 개가 짖습니다. 즉, 재정의된 method()가 호출됨.
//        animal1.fetch();        // 이게 불가능 // dog 고유 메서드

        // 클래스 객체 = new 클래스();
        Animal animal2 = new Dog(); // 이게 제가 말하는 A a = new B(); 형태입니다. 시험에 자주 나옴
        // 원래 Animal ⊃ Dog 인데 Animal == Dog() 가 됐다. 근데 Dog 고유의거 못갖다쓴다.
        // animal2 = 세미자식(진또베기 흉내못냄)

        animal2.makeSound();        // 결과값 : 개가 짖습니다.
//        animal2.fetch();            // 불가능

        /*
            클래스A 객체명 = new 클래스B();를 통해 객체를 생성했을 경우
            1. Override가 적용된 메서드, 즉 자식 클래스의 메서드가 호출됨.
            2. 클래스B(자식 클래스)의 고유 메서드는 호출 불가능.

            그럼 어차피 재정의된 method 버전으로 호출이 될거라면 애초에
            클래스B 객제명 = new 클래스B();로 생성해버리면 재정의된 method도 호출되고 고유 method도
            호출할 수 있으니까 골치 안아픈거 아니냐
         */


        Animal animal3 = new Animal();
        animal3.makeSound();        // 결과값 : 동물이 소리를 냅니다.

        // dog1 = 진또배기 자식
        // animal1 = 가짜 자식 (부모가 자식인척함) 근데 진짜 흉내는 못냄
        // animal2 = 세미자식 (진또베기 흉내못냄)
        // animal3 = 진또배기 부모
        // Animal = 부모모임 / Dog = 자식모임

        // 연산자 instanceof 사용사례
        boolean result1 = animal1 /* == 가짜자식 */ instanceof Animal/* 부모 */;
        System.out.println(result1);        // true  Animal ⊃ animal1
        // 부는 가짜자식을 품냐? ㅇㅇㅇ 품음

        boolean result2 = animal1 /* == 가짜자식 */ instanceof Dog/*자식*/;
        System.out.println(result2);        // true  Dog ⊃ animal1   // 자식은 가짜자식을 포함하냐? 맞지.
        // 자식이 가짜자식을 품냐? ㅇㅇㅇ 품음(같 찐만다름)

        // : 업캐스팅이 이루어지지 않고 그냥 Dog dog1 = new Dog(); 로 만든 객체 역시
        boolean result3 = dog1/*세미자식*/ instanceof Animal/*부모*/;
        System.out.println(result3);        // true Animal ⊃ dog1    // 부모는 세미자식을 포함하냐? 맞지
        // 부모모임은 진또베기 자식을 품냐? ㅇㅇㅇ품음

        boolean result4 = animal2 instanceof Dog;
        System.out.println(result4);        // true
        // 자식모임은 세미자식을 품냐? ㅇㅇㅇ품음

        // animal3의 경우 Animal animal3 = new Animal(); 로 생성했습니다.
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);        // true
        // 부모모임은 찐또배기부모를 품냐? ㅇㅇㅇ품음

        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);        // false
        // 자식모인은 진또배기 부모를 품냐? ㄴㄴㄴ 못품음

        // 객체명 instanceof 클래스명
        System.out.println("↑ 업캐스팅 파트 - 객체명.메서드명(); 했을 때 재정의 버전이 나오는가 아닌가에 주목");
        System.out.println("↓ 다운캐스팅 파트");
        /*
            다운캐스팅은 '명시적'으로 이루어져야 합니다.
            방법
            (클래스명)객체명; → (int)2.3;과 같은 방식이죠. conversion의 객체 버전이라고 생각하시면 됩니다.
            그래서 기본 자료형의 형변환에서 벗어나서 참조 자료형까지 고려해야 합니다.
         */
        // animal = 실수, dog = 정수
        Dog dog2 = (Dog) animal2;
        // dog2 = 속좁아진 세미자식
        // 다운캐스팅 방법 → 위에 보시면 Animal animal2 = new Dog(); 으로 생성해서 dog2 객체명은 없습니다.
        dog2.makeSound();   // 결과값 : 개가 짖습니다.
        dog2.fetch();       // 결과값 : 강아지가 공을 물어옵니다.
        // dog2로 새로운 객체명을 선언하고 거기에 명시적 참조자료형 캐스팅을 적용하여 Animal 클래스의
        // 인스턴스인 animal2를  downcasting했습니다.
        // 그 결과 원래도 되던 재정의 버전의 makesound(); 호출은 변함이 없고
        // do 클래스의 고유 메서드인 fetch();도 호출이 가능합니다.
        // 여전히 B b = new B();로 생성하면 귀찮은 일 없지 않냐는 의문이 존재합니다.

        // 부모가 자식이 될수 없기때문에 오류남.  큰게 작은거될라고 해서 오류남.
//        Dog dog3 = (Dog) animal3; // downcasting을 하는 과정에서 오류가 발생함
//        dog3.makeSound(); // 그러니까 얘는 지금 호출도 못해보는 상황입니다.
        /*
            78번 라인에서 오류가 발생했습니다.
            즉, 애초에 animal3를 생성할 때 Animal 클래스의 생산자를 호출해서 만들었기 때문에
            (A a = new A(); 이기 때문에)
            하위 클래스의 인스턴스로 다운캐스팅하는 것이 불가능합니다.

            이상을 해결하기 위해서는
         */
        Animal animal4 = new Dog();
        //  animal4 = 세미자식(진또베기 흉내 못냄) // 부모모임의 animal4 는 자식모임 참가
        // 형태로 선언된 클래스와 호출되는 새성자가 서로 달라야 합니다.(그리고 둘은 상속관계여야합니다.)

        // 그렇다면 현재 코드라인 상에서 빨간줄 뜨지도 않았으니까 잘못 다운캐스팅이 이루어지는지에 대한
        // 확인이 불가능한 상황인데, 이를 해결하기 위한 것이 instanceof 연산자입니다.

        System.out.println("animal4 검증 파트");
        if(animal4 instanceof Dog /*=true*/) {        // 이 조건식이 true라면 animal4의 생성자 호출한 생성자는Dog();
            // 자식은 세미자식을 품냐? ㅇㅇㅇ 품음
            Dog dog4 = (Dog) animal4;       // 그러므로 96번 라인의 실행문을 통해 다운캐스팅을 하더라도 오류발생 x
            // dog4 = 속좁아진 세미자식(진짜 자식거 갖다씀)
            dog4.makeSound();
            dog4.fetch();
        }
        System.out.println("animal3는 다운캐스팅 안되는거 알았으니까 검증 후에 다운캐스팅 시도해야겠네요.");
        if(animal3 instanceof Dog) {
            // 자식모임은 진또배기 부모를 품냐? ㄴㄴ 못품음 그래서 불가능한 다운캐스팅입니다 출력
            Dog dog3 = (Dog) animal3;

            dog3.makeSound();
            dog3.fetch();
        } else {
            System.out.println("불가능한 다운캐스팅입니다.");
        }

        // ch15_casting의 하위에 centralcontrol

    }
}
