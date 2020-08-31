package lesson16;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if(age<0 || age>120){
            throw new ArithmeticException("Wrong age");
        }
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>120){
            throw new ArithmeticException("Wrong age");
        }
        this.age = age;
    }
}
