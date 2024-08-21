package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj(10);
        ImmutableObj newImmutableObj = immutableObj.add(20);


        System.out.println("immutableObj = " + immutableObj);
        System.out.println("newImmutableObj = " + newImmutableObj);
    }
}
