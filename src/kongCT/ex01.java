package kongCT;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;

public class ex01 {
    public static void main(String[] args) {
        String my_str = "3 + 4 - 7";
        System.out.println(solution(my_str));
    }

    private static int solution(String myStr) {

        String[] str = myStr.split(" ");
        int ans = Integer.parseInt(str[0]);
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals("+")){
                ans += Integer.parseInt(str[i+1]);
            }
            else if(str[i].equals("-")) {
                ans -= Integer.parseInt(str[i+1]);
            }
        }

        System.out.println(ans);

        return 0;
    }
}
