package lang.string.textCode;

public class Ex01 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        String substring = str.substring(0, str.indexOf(ext));
        String substring2 = str.substring(str.indexOf(ext));
        System.out.println("substring = " + substring);
        System.out.println("substring2 = " + substring2);
    }
}
