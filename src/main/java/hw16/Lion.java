package hw16;

public class Lion extends Carnivores {
    private String name;
    private String type;
    private int population;

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


    public Lion(String name, String type, int population) {
        this.name = name;
        this.type = type;
        this.population = population;

    }
    @Override
    public void mammals() {
        System.out.println("We are the kings of the animal kingdom!");
    }

    @Override
    public void vertebrates() {
        System.out.println("Our mane is our crown!");
    }

    @Override
    public void animals() {
        System.out.println("Our pride has a strict hierarchy!");
    }
    @Override
    public String toString() {
        return  name + ",our type= " + type  + ", population= " + population +".";
    }
}
