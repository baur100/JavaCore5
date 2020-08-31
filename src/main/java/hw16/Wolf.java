package hw16;

public class Wolf extends Carnivores {
    private String name;
    private String type;
    private int population;

    public Wolf(String name, String type, int population){
        this.name=name;
        this.type=type;
        this.population=population;

    }
    public String getName(){
        return name;
    }
    public void setName(String NewName){
        this.name=NewName;
    }
    public String getType(){
        return type;
    }
    public void setType(String NewType){
        this.type=NewType;
    }
    public int getPopulation(){
        return population;
    }
    public void setPopulation(int NewPopulation){
        this.population=NewPopulation;
    }

    @Override
    public void breathe() {
        System.out.println("Wolf can breathe");

    }

    @Override
    public void multiply() {
        System.out.println("Breeding wolves create large flocks.");

    }

    @Override
    public void eat() {
        System.out.println("Wolf can eat the meat of rabbits.");

    }

    @Override
    public void die() {
        System.out.println("Unfortunately very often wolf die because guns of hunters.");

    }

    @Override
    public void mammals() {
        System.out.println("We have 4 limbs!");

    }

    @Override
    public void vertebrates() {
        System.out.println("We have flexible vertebrate.");
    }

    @Override
    public void animals() {
        System.out.println("We are the predators of the animal world!");
    }

    @Override
    public String toString() {
        return "We are "+name  + ", type: " + type + ", our population= " + population+ ".";
    }
}
