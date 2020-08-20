package homework10;

public class CivilPlane {
    private String brand;
    private String model;
    private int number_of_passengers;
    private int distance_of_flight;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getNumber_of_passengers() {
        return number_of_passengers;
    }

    public int getDistance_of_flight() {
        return distance_of_flight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber_of_passengers(int number_of_passengers) {
        this.number_of_passengers = number_of_passengers;
    }

    public void setDistance_of_flight(int distance_of_flight) {
        this.distance_of_flight = distance_of_flight;
    }

    public CivilPlane(String brand, String model, int number_of_passengers, int distance_of_flight) {
        this.brand = brand;
        this.model = model;
        this.number_of_passengers = number_of_passengers;
        this.distance_of_flight = distance_of_flight;
    }

    public CivilPlane() {
    }

    public void printPlane() {
        System.out.println("Civil Plane: " +
                "Brand- " + brand +
                ", Model- " + model +
                ", Number of passengers= " + number_of_passengers +
                ", Distance of flight= " + distance_of_flight + "ml");
    }
}
