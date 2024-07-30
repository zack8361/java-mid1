package lang.object;

public class ObjectMain {
    public static void main(String[] args) {

        Child child = new Child();
        child.childMethod();
        child.parentMethod();
        System.out.println(child.getClass());

        // toString()은 Object 클래스의 메서드이다.
        String string = child.toString();

    }
}
