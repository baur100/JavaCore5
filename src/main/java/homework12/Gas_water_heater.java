package homework12;

public class Gas_water_heater implements Three_quarter_Inch_steel_pipe {
private String brand_name;
private String type;
private int power;

    public Gas_water_heater(String brand_name, String type, int power) {
        this.brand_name = brand_name;
        this.type = type;
        this.power = power;
    }

    public void thread_diameter() {
        System.out.println("Gas pipe thread diameter for success connection should be no more than 3/4 inch");
    }

    public void thread_length() {
        System.out.println("Lenght of thread for 3/4 inch gas pipe should be no more than 1 inch");

    }

    public void heatersInfo() {
        System.out.println( "\nGas water heater" +
                "\nBrand name is " + this.brand_name +
                "\nType is " + this.type +
                "\nPower= " + this.power + " BTU");
    }
}
