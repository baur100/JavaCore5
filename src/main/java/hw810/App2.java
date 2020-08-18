package hw810;

public class App2 {
    public static void main(String[] args) {

        Menu diet = new Menu();
        Ingredients[]dietIngredients = {Ingredients.CARROT, Ingredients.SALMON};
        diet.setName("Diet menu");
        diet.setMainDish("Salmon with carrot puree");
        diet.setCalories(650);
        diet.setIngredients(dietIngredients);

        diet.PrintMenu();


        Ingredients[]regIngredients = {Ingredients.CARROT, Ingredients.SALMON, Ingredients.BROWN_RICE, Ingredients.GREEK_YOGURT, Ingredients.TOMATOES};

        Menu regular = new Menu ("Regular", "Carbs and sides", 1200, regIngredients);

        regular.PrintMenu();

    }
}
