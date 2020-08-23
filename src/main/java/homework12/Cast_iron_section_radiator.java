package homework12;

public class Cast_iron_section_radiator implements Three_quarter_Inch_steel_pipe {
private String brand;
private String made_in;
private int number_of_sections;

    public Cast_iron_section_radiator(String brand, String made_in, int number_of_sections) {
        this.brand = brand;
        this.made_in = made_in;
        this.number_of_sections = number_of_sections;
    }

    public void thread_diameter() {
        System.out.println("Recommended steam inlet/outlet size - 3/4 inch");
    }

    public void thread_length() {
        System.out.println("Do not tighten until it stops (no more than 3/4 inch)");
    }

    public void radiatorInfo() {
        System.out.println("\nCast iron section radiator" +
                "\nBrand is " + brand +
                "\nMade in " + made_in +
                "\nNumber of sections= " + number_of_sections);
    }
}
