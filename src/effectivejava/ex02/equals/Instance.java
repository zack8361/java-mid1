package effectivejava.ex02.equals;

import java.util.HashSet;

public class Instance {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("이찬호");
        set.add("공희진");
        HashSet<String> set2 = new HashSet<>();
        set2.add("이찬호");
        set2.add("공희진");
        System.out.println(set.equals(set2));
        System.out.println("--------------------------------");


        Student student1 = createStudent("공희진");
        Student student2 = createStudent("공희진");
        System.out.println(student1.equals(student2));

    }

    private static Student createStudent(String name){
        return Student.createStudent(name);
    }
}
