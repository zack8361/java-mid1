package effectivejava.ex01.gradeEx;

public class GradeMain {
    public static void main(String[] args) {
        Grade gradeA = Grade.getGrade(90);
        Grade gradeB = Grade.getGrade(80);
        Grade gradeC = Grade.getGrade(70);
        System.out.println(gradeA.toText());
        System.out.println(gradeB.toText());
        System.out.println(gradeC.toText());
    }
}
