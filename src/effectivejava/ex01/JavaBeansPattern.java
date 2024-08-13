package effectivejava.ex01;

public class JavaBeansPattern {
    private Long id = 0L;
    private String name = "";
    private String address = "";

    public JavaBeansPattern() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
