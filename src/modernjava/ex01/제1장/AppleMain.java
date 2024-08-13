package modernjava.ex01.제1장;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;

/**
 * 자바 8을 이용하면 자연어에 더 가깝게 간단한 방식으로 코드를 구현할 수 있다.
 * 모던 자바 인 액션에 등장한 첫번째 실습 문제
 */
public class AppleMain {
    private static List<Apple> inventory;
    public static void main(String[] args) {

        inventory = new ArrayList<>();

        add(20.5);
        add(10.5);

//        Collections.sort(inventory, new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                return (int) (o1.getWeight() - o2.getWeight());
//            }
//        });
        inventory.sort(comparing(Apple::getWeight));

    }

    private static void add(double weight) {
        inventory.add(new Apple(weight));
    }
}
