package effectivejava.ex02.equals.symmetry;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

public class Member {
    private final String name;

    public Member(String name){
        this.name = requireNonNull(name,"Member 객체 null 값은 전달 될 수 없습니다.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                '}';
    }
}
