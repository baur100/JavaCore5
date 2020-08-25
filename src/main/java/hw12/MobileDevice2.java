package hw12;

public class MobileDevice2 implements DeviceSpecs {
    private String brand;
    private int storageCapacity;
    private String carrier;

    public MobileDevice2(String brand, int storageCapacity, String carrier) {
        this.brand = brand;
        this.storageCapacity = storageCapacity;
        this.carrier = carrier;
    }

    public String toString() {
        return "MobileDevice2{" +
                "brand='" + brand + '\'' +
                ", storageCapacity=" + storageCapacity +
                ", carrier='" + carrier + '\'' +
                '}';
    }

    public void adapterType() {
        System.out.println("Adapter type: USB-C");

    }

    public void operationSystem() {
        System.out.println("Operation system: Android");

    }

    public int osVersion() {
        return 10;
    }

    public int displayDiagonal() {
        return 6;
    }
}
