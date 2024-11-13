package lang.string;

public class LoopStringMain {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String result = "";

        for (int i = 0; i < 100000; i++) {
            result += "hello";
        }

        long end = System.currentTimeMillis();

        System.out.println(result);
        System.out.println("실행 시간 : " + (end - start) / 1000.0);
    }
}
