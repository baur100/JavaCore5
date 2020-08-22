package hw14;

public class Miami extends UnitedStates {

    public int rentPrice;

    public Miami(String state, String city, int population, int rentPrice) {
        super(state, city, population);
        this.rentPrice = rentPrice;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public void printMiamiInfo() {
        System.out.println("Miami is great.My rent is very low- " + rentPrice);
    }
}
