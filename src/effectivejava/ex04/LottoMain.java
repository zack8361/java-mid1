package effectivejava.ex04;

import java.util.ArrayList;
import java.util.List;

public class LottoMain {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        WinningLotto winningLotto = new WinningLotto(list);


    }
}
