package hw810;

public class Menu {
    private String name;
    private  String mainDish;
    private  int calories;
    private  Ingredients [] ingredients;

    public Menu(String name, String mainDish, int calories, Ingredients[] ingredients) {
        this.name = name;
        this.mainDish = mainDish;
        this.calories = calories;
        this.ingredients = ingredients;

    }

    public Menu (){}

    //    public Menu (String name, int calories, String mainDish, Ingredients[]ingredients);
//    this.n


    public String getName() {
        return name;
    }

    public String getMainDish() {
        return mainDish;
    }

    public int getCalories() {
        return calories;
    }

    public Ingredients[] getIngredients() {
        return ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setIngredients(Ingredients[] ingredients) {
        this.ingredients = ingredients;
    }

    public void PrintMenu (){
        System.out.println(name +"" + mainDish + "" + calories + "");
        for (Ingredients v: this.ingredients){
            System.out.println(v);
        }
    }







}
