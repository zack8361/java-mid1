package effectivejava.ex02.clone;

public class Person implements Cloneable{
    private String name;
    private int age;

    public Person(String name, int age) {
        // 중요한 초기화 로직이 있다.
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }
}
