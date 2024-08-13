package lang.object.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress immutableAddress = new ImmutableAddress("서울");
        MemberV2 memberA = new MemberV2("이찬호", immutableAddress);
        MemberV2 memberB = new MemberV2("곽명환", immutableAddress);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
        
        //곽명환의 주소를 신정동으로 변경
        memberB.setImmutableAddress(new ImmutableAddress("대구"));
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
