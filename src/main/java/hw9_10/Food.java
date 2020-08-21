package hw9_10;

public class Food {

    private String fruits;
    private String vegetables;
    private String meat;
    private String sweets;

    public Food(String fruits, String vegetables, String meat, String sweets) {
        this.fruits = fruits;
        this.vegetables = vegetables;
        this.meat = meat;
        this.sweets = sweets;
    }

    public Food() {

    }

    public String getFruits() {
        return fruits;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getSweets() {
        return sweets;
    }

    public void setSweets(String sweets) {
        this.sweets = sweets;
    }

    public void printFood() {
        System.out.println("I love " + fruits + " and " + vegetables + "," + "i try to eat less " + meat + " and " + sweets);
    }
}
