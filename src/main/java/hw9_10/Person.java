package hw9_10;

public class Person {

    private String name;
    private int age;
    private int weight;
    private String eyeColor;

    public Person(String name, int age, int weight, String eyeColor) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.eyeColor = eyeColor;
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
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void printPerson() {
        System.out.println("I'm " + name + "," + "i'm " + age + "," + "I weight " + weight + "," + "my eye color is " + eyeColor);
    }
}
