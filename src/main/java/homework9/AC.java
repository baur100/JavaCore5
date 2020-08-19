package homework9;

public class AC {
    public String brand;
    public String model;
    public int BTU;
    public String control_type;
    public int warranty;
    public String installation_type;

    public void Print_AC_info (){
        System.out.println("AC brand name- "+ brand);
        System.out.println("AC model name- "+model);
        System.out.println("AC BTU-  "+BTU);
        System.out.println("AC control type- "+control_type);
        System.out.println("AC Warranty- "+warranty +" years");
        System.out.println("AC installation type- "+installation_type);
    }
}
