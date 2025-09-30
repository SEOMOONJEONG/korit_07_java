package ch09_classes.products2;

public class Product2 {
    int productNum;
    String productName;

    Product2(){

    }

    Product2(int productNum){
        this.productNum = productNum;
    }

    Product2(String productName){
        this.productName = productName;
    }

    Product2(int productNum, String productName){
        this.productNum = productNum;
        this.productName = productName;
    }

    public void showInfo(){
        System.out.println();
        System.out.println("시리얼 넘버 : " + productNum);
        System.out.println("제품 타이틀 : " + productName);
    }
}
