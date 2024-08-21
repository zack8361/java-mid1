package lang.immutable.myDateTest;

public class MyDate {
    private final int year;
    private final int month;
    private final int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // year 바꿔서 새로운 객체로 전달
    public MyDate withYear(int newYear){
        return new MyDate(newYear,month,day);
    }

    // month 바꿔서 새로운 객체로 전달
    public MyDate withMonth(int newMonth){
        return new MyDate(year,newMonth,day);
    }
}
