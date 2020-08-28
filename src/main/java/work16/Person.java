package work16;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Person() {
    }

    public void setName(String name) {
        if (age<0 || age>120){
            throw new ArithmeticException("Wrong age");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0 || age>120){
            throw new ArithmeticException("Wrong age");
        }
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
