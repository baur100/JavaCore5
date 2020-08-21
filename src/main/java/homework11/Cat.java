package homework11;

import java.util.Arrays;

public class Cat extends Animal {
    private String cat_breed;

    public Cat(String name, int age, Color color, Food[] food, String cat_breed) {
        super(name, age, color, food);
        this.cat_breed = cat_breed;
    }

    public Cat() {
    }

    public String getCat_breed() {
        return cat_breed;
    }

    public void setCat_breed(String cat_breed) {
        this.cat_breed = cat_breed;
    }

    public void catInfo() {
        System.out.println("\nCAT" +
                "\nBreed is " + cat_breed +
                "\nName is " + name +
                "\nAge= " + age + " years" +
                "\nColor is " + color +
                "\nFood= " + Arrays.toString(food));
    }
}
