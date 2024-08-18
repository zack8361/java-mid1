package effectivejava.ex02.hashcode;

import java.util.HashMap;

public class PhoneNumberMain {
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기

        HashMap<PhoneNumber, String> map = new HashMap<>();
        map.put(new PhoneNumber(100,200,300),"이찬호");


        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산

        System.out.println("member = " + map.get(new PhoneNumber(100, 200, 300)));
        System.out.println("걸린시간(m) : "+secDiffTime);
    }
}
