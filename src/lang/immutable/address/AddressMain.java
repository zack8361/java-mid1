package lang.immutable.address;

public class AddressMain {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산"); // 참조 값의 변화.

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
