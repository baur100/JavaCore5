package hw10;

public class Aves {
    private String type;
    private String hazardClass;
    private int averageSize;


    public Aves(String type, String hazardClass, int averageSize) {
        this.type = type;
        this.hazardClass = hazardClass;
        this.averageSize = averageSize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHazardClass() {
        return hazardClass;
    }

    public void setHazardClass(String hazardClass) {
        this.hazardClass = hazardClass;
    }

    public int getAverageSize() {
        return averageSize;
    }

    public void setAverageSize(int averageSize) {
        this.averageSize = averageSize;
    }

    public String printInfo() {
        return "Aves{" +
                "type='" + type + '\'' +
                ", hazardClass='" + hazardClass + '\'' +
                ", averageSize=" + averageSize +
                '}';
    }
}


