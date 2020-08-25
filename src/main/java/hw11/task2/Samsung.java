package hw11.task2;

public class Samsung extends MobilePhone{
    private int numbersOfCameras;
    private String chargingPort;

    public Samsung(String brand, String version, int releaseYear, int storage, int numbersOfCameras, String chargingPort) {
        super(brand, version, releaseYear, storage);
        this.numbersOfCameras = numbersOfCameras;
        this.chargingPort = chargingPort;
    }

    public int getNumbersOfCameras() {
        return numbersOfCameras;
    }

    public void setNumbersOfCameras(int numbersOfCameras) {
        this.numbersOfCameras = numbersOfCameras;
    }

    public String getChargingPort() {
        return chargingPort;
    }

    public void setChargingPort(String chargingPort) {
        this.chargingPort = chargingPort;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "numbersOfCameras=" + numbersOfCameras +
                ", chargingPort='" + chargingPort + '\'' +
                ", brand='" + brand + '\'' +
                ", version='" + version + '\'' +
                ", releaseYear=" + releaseYear +
                ", capacity=" + capacity +
                '}';
    }
}
