package hw14;

public class Parents extends Family{
    private String name;
    private int age;

    public Parents(String lastName, Address address, SchoolsAttended[] schools, Vacation vacation, String name, int age) {
        super(lastName, address, schools, vacation);
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Parents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

