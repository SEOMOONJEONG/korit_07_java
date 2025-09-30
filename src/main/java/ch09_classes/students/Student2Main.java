package ch09_classes.students;

public class Student2Main {
    public static void main(String[] args) {
        Student2 student1= new Student2();
        student1.studentCode = 2025001;
        student1.name = "김일";
        student1.score = 4.5;

        Student2 student2 = new Student2(2025002);
        student2.name = "김이";
        student2.score = 100;

        Student2 student3 = new Student2("김삼");
        student3.studentCode = 2025003;
        student3.score = 95.8;

        Student2 student4 = new Student2(2025004, "김사");
        student4.score = 4.0;

        Student2 student5 = new Student2(2025005, "김오", 80.7);

        // showInfo()
        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();
    }

}
