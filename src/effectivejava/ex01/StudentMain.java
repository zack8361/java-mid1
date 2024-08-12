package effectivejava.ex01;

import static effectivejava.ex01.Gender.MEN;

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = Student.createStudent("이찬호", 26, MEN);
        Student student2 = Student.createStudent("이찬호", 26, MEN);

        System.out.println("student2 = " + student2);
        System.out.println("student1 = " + student1);
    }
}
