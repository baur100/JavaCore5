package hw12;

public class Vegetable implements EuropeanWeightStandard{
    private String name;
    private int weight;

    public Vegetable(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public void CanCook(){
        System.out.println("You will get delicious meal");
    }

    public void kg() {
        System.out.println("EU Standard");

    }
    public void gr() {
        System.out.println("EU Type");

    }

    @Override
    public String toString() {
        return "Vegetable" +
                "\nname='" + name + '\'' +
                "\nweight=" + weight +
                "\n***************************";
    }
}
