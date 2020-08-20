package hw10;

public class Arachnids {
    private String type;
    private String hazardClass;
    private int numberOfPaws;


    public Arachnids(String tp, String hc, int np) {
        this.type = tp;
        this.hazardClass = hc;
        this.numberOfPaws = np;
    }

    public Arachnids() {

    }

    public void setType(String type) {

    }

    public void setHazardClass(String hazardClass) {

    }

    public void setNumberOfPaws(int numberOfPaws) {

    }

    public String getType() {
        return type;
    }

    public String getHazardClass() {
        return hazardClass;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;

    }

    public void printInfo() {
        System.out.println("Arachnids{" +
                "type='" + type + '\'' +
                ", hazardClass='" + hazardClass + '\'' +
                ", numberOfPaws='" + numberOfPaws + '\'' +
                '}');
    }
}
