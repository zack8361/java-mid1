package effectivejava.ex02.clone;

// Stack의 복제 가능 버전 (80-81쪽)
public class Stack implements Cloneable {
    private Person person;
    private Object[] elements;

    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // 코드 13-2 가변 상태를 참조하는 클래스용 clone 메서드

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Stack clone = (Stack) super.clone();
        clone.elements = elements.clone();
        return clone;
    }
}
