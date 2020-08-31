package lesson16;

public class Person {
    private String name;
    private int age;
public Person(){}
    public Person(String name, int age) {
        if (age>120||age<0){
            throw new ArithmeticException("Wrong age");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if (age>120||age<0){
            throw new ArithmeticException("Wrong age");
        }
        return age;
    }

    public void setAge(int age) {
        if (age>120||age<0){
            throw new ArithmeticException("Wrong age");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
