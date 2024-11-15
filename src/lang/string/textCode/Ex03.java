package lang.string.textCode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.join;

public class Ex03 {
    public static void main(String[] args) {
        String fruits = "apple,banana,kiwi";
        String[] fruitArr = fruits.split(",");
        System.out.println();
        List<String> strings = new ArrayList<>();
        strings.add("123");
        strings.add("123");
        strings.add("123");
        String joins = String.join("->", strings);
        System.out.println(joins);
        String join = join("->", fruitArr);
        System.out.println(join);
    }
}
