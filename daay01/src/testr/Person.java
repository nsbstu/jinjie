package testr;

public class Person {
    private String name;

    public Person() {
        System.out.println("父类的无参构造");
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
