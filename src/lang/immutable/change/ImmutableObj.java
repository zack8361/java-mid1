package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    // 생성자
    public ImmutableObj(int value) {
        this.value = value;
    }

    // getter
    public int getValue() {
        return value;
    }

    // add
    public ImmutableObj add(int addValue){
        int newValue = value + addValue;
        return new ImmutableObj(newValue);
    }
}
