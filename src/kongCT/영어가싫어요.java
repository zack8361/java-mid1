package kongCT;

import java.util.HashMap;

public class 영어가싫어요 {
    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnine";
        System.out.println(solution(numbers));
    }

    private static long solution(String numbers) {

        String answer = "";
        HashMap<String, String> map = new HashMap<>();
        map.put("one","1");map.put("two","2");map.put("three","3");map.put("four","4");map.put("five","5");
        map.put("six","6");map.put("seven","7");map.put("eight","8");map.put("nine","9");map.put("zero","0");

        String s = "";
        for (int i = 0; i < numbers.length(); i++) {
            s += numbers.charAt(i);
            if(map.containsKey(s)){
                answer += map.get(s);
                s = "";
            }
        }

        return Long.parseLong(answer);
    }
}
