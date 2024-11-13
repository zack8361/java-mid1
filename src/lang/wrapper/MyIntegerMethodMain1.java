package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        int value = 10;
        int v1 = compareTo(value, 5);

    }
    private static int compareTo(int value, int target) {
        if(value < target) {
            return -1;
        } else if(value == target) {
            return 0;
        } else {
            return 1;
        }
    }
}
