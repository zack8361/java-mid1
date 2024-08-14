package effectivejava.ex01.singleton;

public class Member {
    private int id;
    private String name;
    private Student type;

    private Member(){

    }

    private Member(int id, String name, Student type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public static Member createMember(int id, String name, Student type){
        return new Member(id,name,type);
    }
}
