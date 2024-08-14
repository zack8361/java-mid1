package effectivejava.ex01.singleton;

public class SingletonExample {
    public static final SingletonExample INSTANCE = new SingletonExample();

    private SingletonExample() {
    }

    public static SingletonExample getInstance(){
        return INSTANCE;
    }

}
