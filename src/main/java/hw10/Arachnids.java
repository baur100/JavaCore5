package hw10;

public class Arachnids {
    private String type;
    private String hazardClass;
    private int numberOfPaws;


    public Arachnids(String type, String hazardClass, int numberOfPaws) {
        this.type = type;
        this.hazardClass = hazardClass;
        this.numberOfPaws = numberOfPaws;
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

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public String printInfo() {
        return "Arachnids{" +
                "type='" + type + '\'' +
                ", hazardClass='" + hazardClass + '\'' +
                ", numberOfPaws=" + numberOfPaws +
                '}';
    }
}

