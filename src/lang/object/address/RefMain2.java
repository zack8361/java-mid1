package lang.object.address;

public class RefMain2 {
    public static void main(String[] args) {

        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 불변객체라는것을 개발자가 확인한 후 새로운 인스턴스 생성 > 오류가 날 확률이 줄어든다.
        b = new ImmutableAddress("부산");
        System.out.println("a = " + a);
        System.out.println("vb = " + b);
    }
}
