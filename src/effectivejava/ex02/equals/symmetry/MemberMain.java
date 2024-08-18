package effectivejava.ex02.equals.symmetry;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("공희진");
        Member member2 = new Member("공희진");

        System.out.println(member);
        System.out.println(member.equals(member2));
    }
}
