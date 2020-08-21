package homework11;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Food[] cat_food = {Food.FISH, Food.DAIRY, Food.WET_FOOD};

        Cat barsik = new Cat();
        barsik.setCat_breed("British");
        barsik.setName("Barsik");
        barsik.setAge(4.5);
        barsik.setColor(Color.BLUE);
        barsik.setFood(cat_food);

        System.out.println("CAT");
        System.out.println("Name is " + barsik.getName());
        System.out.println("Age= "+barsik.getAge());
        System.out.println("Breed is "+barsik.getCat_breed());
        System.out.println("Color is "+barsik.getColor());
        System.out.println("Diet- " +Arrays.toString(barsik.getFood(cat_food)));

        Food[] dog_food = {Food.MEAT, Food.DRY_FOOD, Food.VEGGIE};
        Dog barbos = new Dog("Barbos", 1.6, Color.GOLD, dog_food, "Labrador");
        barbos.dogInfo();
    }
}
