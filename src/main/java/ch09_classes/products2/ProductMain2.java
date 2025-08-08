package ch09_classes.products2;

public class ProductMain2 {
    public static void main(String[] args) {
        // 객체 생성 방법 클래스명 객체명 = new 생성자;
        // 기본 생성자를 통한 생성
        Product2 product1 = new Product2();
        product1.productNum = 123456;
        product1.productName = "LG엘패드";

        // 매개변수 생성자를 통한 생성(RequiredArgsConstructor)
        Product2 product2 = new Product2(9876564);
        product2.productName = "다이소충전기";

        Product2 product3 = new Product2("USB-C 케이블");
        product3.productNum = 159357;

        // 매개변수 생성자를 통한 생성(AllArgsConstructor)
        Product2 product4 = new Product2(951753, "GFlip6");



        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();


        // ch09_classes 우클릭 → ReviewMethod 클래스 생성
    }
}
