package effectivejava.ex02.clone;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonCloneMain {
    public static void main(String[] args) throws CloneNotSupportedException {

        Stack stack = new Stack();
        Stack clone = (Stack) stack.clone();
        System.out.println(stack.getElements());
        System.out.println(clone.getElements());

        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();

    }
}
