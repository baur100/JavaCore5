package hw11;

public class Continent extends Ground{
    protected Continents continent;
    protected int sqc;
    protected String description;

    //GETTERS
    public Continents getContinent() {
        return continent;
    }

    public int getSqc() {
        return sqc;
    }

    public String getDescription() {
        return description;
    }

    //SETTERS
    public void setContinent(Continents NewContinent) {
        this.continent = NewContinent;
    }

    public void setSqc(int sqc) {
        this.sqc = sqc;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //CONSTRUCTION
    public Continent() {
    }
    public Continent(String name, double sq, int people, Continents continent, int sqc, String description) {
        super(name, sq, people);
        this.continent = continent;
        this.sqc = sqc;
        this.description = description;
    }

    public Continent(String name, double sq, int people, Continents continent, String description) {
        super(name, sq, people);
        this.continent = continent;
        this.description = description;
    }

    public Continent(String name, double sq, Continents continent, int sqc, String description) {
        super(name, sq);
        this.continent = continent;
        this.sqc = sqc;
        this.description = description;
    }

    public Continent(String name, double sq, Continents continent, int sqc) {
        super(name, sq);
        this.continent = continent;
        this.sqc = sqc;
    }

    public Continent(String name, double sq, int people, Continents continent, int sqc) {
        super(name, sq, people);
        this.continent = continent;
        this.sqc = sqc;
    }

    public Continent(String name, Continents continent, int sqc, String description) {
        super(name);
        this.continent = continent;
        this.sqc = sqc;
        this.description = description;
    }

    public Continent(String name, Continents continent, String description) {
        super(name);
        this.continent = continent;
        this.description = description;
    }

    @Override
    public String toString() {
        return "The "+ name +
                " includes " + sq +
                " million sq miles. The "  + name+
                " has "+continent+". It's the " + description + " continent among others, it holds around "+sqc
                +" million sq miles with "+people+" milliards people.";
    }
}
