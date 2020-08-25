package hw12;

public class MobileDevice1 implements DeviceSpecs {
    private String brand;
    private int storageCapacity;
    private String carrier;

    public MobileDevice1(String brand, int storageCapacity, String carrier) {
        this.brand = brand;
        this.storageCapacity = storageCapacity;
        this.carrier = carrier;
    }

    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", storageCapacity=" + storageCapacity +
                ", carrier='" + carrier + '\'' +
                '}';
    }

    public void operationSystem() {
        System.out.println("Operation system: iOS");

    }

    public int osVersion() {
        return 14;
    }


    public int displayDiagonal() {
        return 6;
    }

    public void adapterType() {
        System.out.println("Adapter type: Lightning to USB-C");

    }
}
