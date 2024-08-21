package lang.immutable.myDateTest;

public class MyDateTestMain {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(2024,8,20);
        MyDate myDate2 = myDate;

        MyDate newDate = myDate.withMonth(21);
        System.out.println("newDate = " + newDate);

    }
}
