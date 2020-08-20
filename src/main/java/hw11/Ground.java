package hw11;

public class Ground {
    protected String name;
    protected double sq;
    protected int people;

    public String getName() {
        return name;
    }

    public void setName(String NewName) {
        this.name = NewName;
    }

    public double getSq() {
        return sq;
    }

    public void setSq(double NewSq) {
        this.sq = NewSq;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int NewPeople) {
        this.people = NewPeople;
    }

    //CONSTRUCTION
    public Ground(){

    }
    public Ground(String name, double sq, int people) {
        this.name = name;
        this.sq = sq;
        this.people = people;
    }

    public Ground(String name, double sq) {
        this.name = name;
        this.sq = sq;
    }

    public Ground(String name) {
        this.name = name;
    }
    public void infoGround(){
        System.out.println(name+ sq+ " amount of people:"+people+".");
    }
}
