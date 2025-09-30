package ch18_static;

public class ProductMain {
    public static void main(String[] args) {
        // static 메서드의 호출은 객체를 생성하지 않은 시점에서도 가능합니다.
        // 객체 생성 전
//        System.out.println(Product.getTitle());

//        Product product1 = new Product();
//        product1.setName("아이스아메리카노");
//        System.out.println(product1.getName());     //객체명.getName()      - 클래스레벨 @Getter
//        System.out.println(Product.getCount());     //클래스명.getCount()     - 필드명 @Getter

        System.out.println(Product.getCount());     // 정적변수 값 : 0

        Product product1 = new Product();       // Product 클래스의 인스턴스가 생성되었습니다.
        System.out.println("일반 필드 조회 : " + product1.getInstanceCount());        // 일반필드 : 1
        System.out.println("정적 필드 조회 : " + Product.getCount());     // 정적변수 값 : 1

        Product product2 = new Product();       // Product 클래스의 인스턴스가 생성되었습니다.
        System.out.println("일반 필드 조회 : " + product2.getInstanceCount());        // 일반필드 : 1
        System.out.println("정적 필드 조회 : " + Product.getCount());     // 정적변수 값 : 2

        Product product3 = new Product();       // Product 클래스의 인스턴스가 생성되었습니다.
        System.out.println("일반 필드 조회 : " + product3.getInstanceCount());        // 일반필드 : 1
        System.out.println("정적 필드 조회 : " + Product.getCount());     // 정적변수 값 : 3

        // 일반필드는 왜 계속 1일까? → 객체 생성 전 필드 값 x  / 객체가 처음 생성 됐을 때 0이라는 값을 할당 받음
        // 생성자가 생성됐을때 1이라는 값을 할당 받음
        // product1 → 1번 호출 : 0 → 1
        // product2 → 1번 호출 : 0 → 1

        System.out.println("-----------------------");
        product1.increaseInstanceCount();
        System.out.println("일반 필드 조회 : " + product1.getInstanceCount());
        // 필드가 인스턴스 레벨인지 클래스 레벨인지 확인 필요 → static의 유무.

    }
}
