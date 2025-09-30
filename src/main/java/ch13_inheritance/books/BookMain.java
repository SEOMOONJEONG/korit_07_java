package ch13_inheritance.books;

public class BookMain {
    public static void main(String[] args) {
        // 제목 : 자바의 정석
        // 저자 : 남궁성
        Book book1 = new Book("자바의 정석", "남궁성");
        String bookTitle = book1.getTitle();
        String bookAuthor = book1.getAuthor();
        System.out.println("이 책의 제목은 " + bookTitle +"입니다.");
        System.out.println("이 책의 저자는 " + bookAuthor +"입니다.");
        System.out.println();

        // 이 전자책의 포맷은 PDF입니다.
        EBook eBook1 = new EBook("스프링 입문", "이강준", 5.2, "PDF");
        System.out.println("이 전자책의 포맷은 " + eBook1.getFormat() +"입니다.");
        System.out.println();

        // 제목 : 스프링 입문
        // 저자 : 이강준
        // 파일 크기 : 5.2
        // 파일 형식 : PDF
        eBook1.showInfo();

    }
}
