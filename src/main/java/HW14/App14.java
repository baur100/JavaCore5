package HW14;

import java.util.Arrays;

public class App14 {

    public static void main(String[] args) {



        int[] parkingNumbers = {33, 443, 211, 11};
        Condo paradise = new Condo("white", 23, "Boston", parkingNumbers);
        System.out.println(paradise.getColor());
        System.out.println(paradise.getFloors());
        System.out.println(Arrays.toString(parkingNumbers));

        System.out.println(paradise.toString());



    }
}
