package hw11.task2;

public class Apple extends MobilePhone {
    private String camera;

    public Apple(String brand, String version, int releaseYear, int storage, String camera) {
        super(brand, version, releaseYear, storage);
        this.camera = camera;
    }


    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "camera='" + camera + '\'' +
                ", brand='" + brand + '\'' +
                ", version='" + version + '\'' +
                ", releaseYear=" + releaseYear +
                ", capacity=" + capacity +
                '}';
    }
}
