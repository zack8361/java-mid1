package effectivejava.ex02.hashcode;

import java.util.Objects;

public class PhoneNumber {
    private final int firstNum;
    private final int secondNum;
    private final int thirdNum;

    public PhoneNumber(int firstNum, int secondNum, int thirdNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.thirdNum = thirdNum;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "firstNum=" + firstNum +
                ", secondNum=" + secondNum +
                ", thirdNum=" + thirdNum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return firstNum == that.firstNum && secondNum == that.secondNum && thirdNum == that.thirdNum;
    }


    // 자바에서 지원해주는 성능이 아쉬운 해시코드
    @Override
    public int hashCode() {
        return Objects.hash(firstNum, secondNum, thirdNum);
    }
}
