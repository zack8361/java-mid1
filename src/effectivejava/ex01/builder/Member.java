package effectivejava.ex01.builder;

public class Member {
    private int id;
    private String name;
    private String grade;
    private String phoneNumber;

    public Member(int id, String name, String grade, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.phoneNumber = phoneNumber;
    }

    public static class MemberBuilder{
        private int id;
        private String name;
        private String grade;
        private String phoneNumber;

        public MemberBuilder id(int id){
            this.id = id;
            return this;
        }
        public MemberBuilder name(String name){
            this.name = name;
            return this;
        }
        public MemberBuilder grade(String grade){
            this.grade = grade;
            return this;
        }
        public MemberBuilder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Member build(){
            return new Member(id,name,grade,phoneNumber);
        }

    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
