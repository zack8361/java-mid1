package effectivejava.ex03.immutable;

import java.util.Objects;

public class Money {
    private final int amount;

    private Money(int amount) {
        this.amount = amount;
    }
    public static Money createMoney(int amount){
        return new Money(amount);
    }
    public Money add(Money money){
        return new Money(amount + money.amount);
    }

    public Money minus(Money money){
        return new Money(this.amount - money.amount);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }
    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                '}';
    }
}
