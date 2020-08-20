package hw10;

public class Mammalian {
    private String type;
    private String hazardClass;
    private Aptitudes aptitudes;


    public Mammalian(String type, String hazardClass, Aptitudes aptitudes) {
        this.type = type;
        this.hazardClass = hazardClass;
        this.aptitudes= aptitudes;
    }

    public Mammalian() {

    }

    public void setType(String type) {

    }

    public void setHazardClass(String hazardClass) {

    }

    public void setAptitudes(Aptitudes aptitudes) {
        this.aptitudes = aptitudes;

    }

    public String getType() {
        return type;
    }

    public String getHazardClass() {
        return hazardClass;
    }

    public Aptitudes getAptitudes() {
        return aptitudes;

    }

    public void printInfo() {
        System.out.println("Mammalian{" +
                "type='" + type + '\'' +
                ", hazardClass='" + hazardClass + '\'' +
                ", aptitudes='" + aptitudes + '\'' +
                '}');
    }
}