package lang.object.address;

public class AddressMainEx01 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;
        
        // Side Effect 발생
        change(b,"부산");
        // 불변의 객체를 설정해주는 해결방법이 필요하다.
        printWrite(a);
        printWrite(b);
    }

    // 공유된 객체의 값을 변경 한 것에 문제가 발생. -> Setter 를 막아야할듯
    private static void change(Address address, String changeAddress){
        address.setValue(changeAddress);
    }
    private static void printWrite(Address address){
        System.out.println(address);
    }
}