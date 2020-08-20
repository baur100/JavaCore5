package hw10;

public class Aves {
    private String type;
    private String hazardClass;
    private int averageSize;


    public Aves(String a, String hc, int c) {
        type = a;
        hazardClass = hc;
        averageSize = c;
    }

    public Aves() {

    }

    public void setType(String type) {

    }

    public void setHazardClass(String hazardClass) {

    }

    public void setAverageSize(int averageSize) {

    }

    public String getType() {
        return type;
    }

    public String getHazardClass() {
        return hazardClass;
    }

    public void AverageSize() {

    }

    public void printInfo() {
        System.out.println("Aves{" +
                "type='" + type + '\'' +
                ", hazardClass='" + hazardClass + '\'' +
                ", averageSize='" + averageSize + '\'' +
                '}');
    }
}


