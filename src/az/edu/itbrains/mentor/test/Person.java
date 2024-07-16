package az.edu.itbrains.mentor.test;

public class Person {

    public static int count;

    private int id;
    private String name;

    public Person(String name) {
        this.name=name;
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
