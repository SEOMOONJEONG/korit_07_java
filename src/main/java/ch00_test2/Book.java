package ch00_test2;

import lombok.Getter;

@Getter
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo(){
        System.out.print("제목: " + title + ", 저자: " + author);
    }
}
