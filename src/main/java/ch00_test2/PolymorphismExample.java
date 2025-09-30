package ch00_test2;

class Animal {
    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() { System.out.println("멍멍!"); }
    public void fetch() { System.out.println("공을 가져옵니다.");}
}

class Cat extends Animal {
    @Override
    public void makeSound() { System.out.println("멍멍!"); }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // TODO: animals 배열의 0번 인덱스에 Dog 객체를, 1번 인덱스에 Cat 객체를 할당하시오.
        // TODO : 반복문을 사용하여 모든 동물의 makeSound() 메서드를 호출하시오.
        // 추가로, instanceof를 사용해 Dog일 경우 다운캐스팅하여 fatch() 메서드를 호출하시오.
        Animal[] animals = new Animal[2];   // animals 크기 2로 생성하여
        animals[0] = new Dog();     // Dog 객체 담고
        animals[1] = new Cat();     // Cat 객체 담음

        for(Animal animal : animals) {  // 배열 animals를 순회하는 반복문 시작 + 각 요소를 animal 변수로 받아서 작업 진행
            animal.makeSound();
            if(animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.fetch();
            }
        }

    }
}
