package hw12;

public class Tractor implements Wheels, SteeringWheel {
    private int loadCapacity;
    private String model;
    private String gearType;

    public Tractor(int loadCapacity, String model, String gearType) {
        this.loadCapacity = loadCapacity;
        this.model = model;
        this.gearType = gearType;
    }


    public void mustBeRounded() {
        System.out.println("bigggggg steering wheeel");
    }

    public void mustHaveHorn() {
        System.out.println("Brrrrrrrr");
    }

    public void size() {
        System.out.println("Wheel Size 57' ");
    }

    public void psi() {
        System.out.println("90 psi");
    }
}
