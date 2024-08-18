package effectivejava.ex02.equals;

import java.util.Objects;

public class Student {
    String name;

    private Student(String name) {
        this.name = name;
    }

    public static Student createStudent(String name){
        return new Student(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
