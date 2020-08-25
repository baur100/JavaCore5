package hw11.task2;

public class MobilePhone {
    protected String brand;
    protected String version;
    protected int releaseYear;
    protected int capacity;

    public MobilePhone(String brand, String version, int releaseYear, int storage) {
        this.brand = brand;
        this.version = version;
        this.releaseYear = releaseYear;
        this.capacity = storage;
    }

    public MobilePhone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int storage) {
        this.capacity = storage;
    }
}
