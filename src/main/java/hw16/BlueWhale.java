package hw16;

public class BlueWhale extends Carnivores {
    private String name;
    private String type;
    private int population;

    public BlueWhale(String name, String type, int population) {
        this.name = name;
        this.type = type;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public void mammals() {
        System.out.println("We are place in the water.");
    }

    @Override
    public void vertebrates() {
        System.out.println("We have biggest vertebrates on the world!");
    }

    @Override
    public void animals() {
        System.out.println("We are like the rest of animals grow by eating milk!");
    }

    @Override
    public String toString() {
        return  name +", type= " + type +
                ", our population= " + population +".";
    }
}
