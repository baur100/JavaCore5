package hw15;

public class Bear implements Animal  {
    private String name;
    private int age;
    private Color color;

    public Bear(String name, int age, Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Bear() {
    }

    public Bear(String name) {
        this.name = name;
    }

    @Override
    public void breathe() {
        System.out.println(name +" im not breathe when i sleep");

    }

    @Override
    public void death() {
        System.out.println(name +" im to young to dead");

    }

    @Override
    public void breed() {
        System.out.println(name + " Hey Girls!!!!!");

    }
}
