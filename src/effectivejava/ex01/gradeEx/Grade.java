package effectivejava.ex01.gradeEx;

public interface Grade {
    String toText();


    /**
     * 1. 실제 구현체를 숨길 수 있다.
     * 2. 유연하게 객체를 반환할 수 있다 (높은 유연성).
     * 3. API를 경량화 할 수 있다.
     */

    public static Grade getGrade(int score){
        if(score >= 90){
            return new A();
        }
        else if(score >= 80){
            return new B();
        }
        else {
            return new C();
        }
    }
}
