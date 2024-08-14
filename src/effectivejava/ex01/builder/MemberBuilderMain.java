package effectivejava.ex01.builder;

import static effectivejava.ex01.builder.Member.*;

public class MemberBuilderMain {
    public static void main(String[] args) {
        Member member = new MemberBuilder()
                .id(1)
                .name("이찬호")
                .grade("A")
                .phoneNumber("010-1234-1234")
                .build();

        System.out.println("member = " + member);
    }
}
