package lang.string.equals;

/**
 * 동일성(Identity) : == 연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
 * 동등성(Equality) : str1.equals(str2) 연산자를 사용하여 두 객체가 논리적으로 같은지 확인
 */
public class StringEqualsMain {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println("---------------------------");

        String str3 = "hello";
        String str4 = "hello";
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
