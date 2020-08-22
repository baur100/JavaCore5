package hw12;

public class Fruit implements AmericanWeightStandard{
    private String name;
    private int weight;

    public Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public void YouCanEat(){
        System.out.println("It's healthy fruit");
    }

    public void lb() {
        System.out.println("1 pound = 0.453592 kg");

    }

    public void oz() {
        System.out.println("1 ounce = 28.3495 grams");

    }

    @Override
    public String toString() {
        return "Fruit" +
                "\nname='" + name + '\'' +
                "\nweight=" + weight +
                "\n**********************************";
    }
}
