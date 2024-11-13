package lang.string.chaining;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(10);
        adder.add(20);
        adder.add(30);

        int result = adder.getValue();
        System.out.println(result);
    }
}
