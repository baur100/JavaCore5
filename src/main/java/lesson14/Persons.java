package lesson14;

public class Persons {
    private int age;
    private String name;

    public Persons(int age, String name){
        this.age=age;
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
