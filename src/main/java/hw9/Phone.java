package hw9;

public class Phone {
    public String Brand;
    public int Camera;
    public int ScreenSize;
    public int Storage;
    public String Color;

    public void printPhone() {
        System.out.println("Device brand is: " + Brand);
        System.out.println("Device color is: " + Color);
        System.out.println("Device space is: " + Storage + " gb");
        System.out.println("Device screen size is: " + ScreenSize + " inches");
        System.out.println("Device camera is: " + Camera + " megapixels");
    }

}
