package homework11;

import java.util.Arrays;

public class Dog extends Animal {
    private String dog_breed;

    public Dog(String name, double age, Color color, Food[] food, String dog_breed) {
        super(name, age, color, food);
        this.dog_breed = dog_breed;
    }

    public String getDog_breed() {
        return dog_breed;
    }

    public void setDog_breed(String dog_breed) {
        this.dog_breed = dog_breed;
    }

    public void dogInfo() {
        System.out.println("\nDOG" +
                "\nBreed is " + dog_breed +
                "\nName is " + name +
                "\nAge= " + age + " years"+
                "\nColor is " + color +
                "\nDiet- " + Arrays.toString(food));

    }
}