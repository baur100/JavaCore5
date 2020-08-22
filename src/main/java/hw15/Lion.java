package hw15;

public class Lion implements Animal {
    private String name;
    private int age;
    private Color color;

    public Lion(String name, int age, Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Lion() {
    }

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void breathe() {
        System.out.println(name + " I can breathe)))");
    }

    @Override
    public void death() {
        System.out.println(name+" feel im daying!!!");

    }

    @Override
    public void breed() {
        System.out.println(name + " Im ready to breed");

    }
}
