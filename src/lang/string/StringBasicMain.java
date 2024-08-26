package lang.string;

import java.util.Arrays;

public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "hello";

        //String 은 대문자로 시작한다 -> 즉 기본타입이 아니라 참조타입 클래스이다.
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("equals = " + str1.equals(str2));
    }
}
