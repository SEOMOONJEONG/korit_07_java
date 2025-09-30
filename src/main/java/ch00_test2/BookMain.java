package ch00_test2;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성");
        EBook ebook1 = new EBook("스프링 부트 3 백과사전", "김영한", 20.5);

        book1.displayInfo();
        System.out.println();
        ebook1.displayInfo();
    }
}
