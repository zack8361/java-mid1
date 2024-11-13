package lang.string;

public class LoopStringBuildermain {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            result.append("hello");
        }

        long end = System.currentTimeMillis();

        System.out.println(result);
        System.out.println("실행 시간 : " + (end - start) / 1000.0);
    }
}
