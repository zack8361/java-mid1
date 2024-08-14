package effectivejava.ex01.autoboxing;

import static java.lang.Integer.MAX_VALUE;


/**
 * 1. 의도치 않은 오토박싱을 주의하자.
 * 2. 박싱된 기본 타입 보다는 기본 타입을 사용하자.
 */
public class SumExample {

    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기

        Long sum = 0L;
        for (long i = 0; i < MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("su = " + sum);

        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println("걸린시간(m) : "+secDiffTime);
    }

}
