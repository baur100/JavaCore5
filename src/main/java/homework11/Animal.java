package homework11;

import org.w3c.dom.ranges.RangeException;

public class Animal {
    protected String name;
    protected double age;
    protected Color color;
    protected Food[] food;

    public Animal(String name, double age, Color color, Food[] food) {
        if (age < 0.1) {
            throw new RangeException((short) 404, "Wrong age");
        }
        this.name = name;
        this.age = age;
        this.color = color;
        this.food = food;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        if (age < 0.1) {
            throw new RangeException((short) 404, "Wrong age");
        }
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Food[] getFood(Food[] food) {
        return food;
    }

    public void setFood(Food[] food) {
        this.food = food;
    }
}
