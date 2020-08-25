package hw11.task2;

public class Xiaomi extends MobilePhone {
    private int size;
    private String androidVersion;


    public Xiaomi(String brand, String version, int releaseYear, int storage, int size, String androidVersion) {
        super(brand, version, releaseYear, storage);
        this.size = size;
        this.androidVersion = androidVersion;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    @Override
    public String toString() {
        return "Xiaomi{" +
                "size=" + size +
                ", androidVersion='" + androidVersion + '\'' +
                ", brand='" + brand + '\'' +
                ", version='" + version + '\'' +
                ", releaseYear=" + releaseYear +
                ", capacity=" + capacity +
                '}';
    }
}
