package ch00_test2;

public class EBook extends Book{

    private final double fileSize;

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(", 파일 크기: "+ fileSize + "MB");
    }
}
