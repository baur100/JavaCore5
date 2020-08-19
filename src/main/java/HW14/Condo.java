package HW14;

import java.util.Arrays;

public class Condo extends House {


   protected int[] parkingNumbers;


    public Condo(String color, int floors, String location, int[] parkingNumbers) {
        super(color, floors, location);
        this.parkingNumbers = parkingNumbers;
    }

    public int[] getParkingNumbers() {
        return parkingNumbers;
    }

    public void setParkingNumbers(int[] parkingNumbers) {
        this.parkingNumbers = parkingNumbers;
    }


    @Override
    public String toString() {
        return "Condo{" +
                "parkingNumbers=" + Arrays.toString(parkingNumbers) +
                ", floors=" + floors +
                ", location='" + location + '\'' +
                '}';
    }
}




