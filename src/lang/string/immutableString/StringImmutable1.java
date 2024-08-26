package lang.string.immutableString;


/**
 * 1. 스트링은 불변 객체 이므로 함수를 lang 내장 함수 반환 값이 무조건 필요하다.
 * 2. 한번 생성된 String 객체 내의 값은 절대 변경되지 않는다.
 */
public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = str.concat(" java");
        System.out.println("concat = " + str2);

        String a = "a";
        String b = "b";

    }
}
