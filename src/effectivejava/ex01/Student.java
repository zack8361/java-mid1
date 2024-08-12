package effectivejava.ex01;

public class Student {
    private String name;
    private int age;
    private Gender gender;

    private Student(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //== 생성자 방식이 아닌 -> 정적 팩토리 메서드 방식 ==//
    public static Student createStudent(String name, int age, Gender gender){
        return new Student(name,age,gender);
    }

//    // toString 재정의
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", gender=" + gender +
//                '}';
//    }
}
