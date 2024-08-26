package effectivejava.ex03.immutable;

public class MoneyMain {
    public static void main(String[] args) {
        Money money = Money.createMoney(100);
        Money add = money.add(money);
        System.out.println(money);
        System.out.println(add);
    }
}
