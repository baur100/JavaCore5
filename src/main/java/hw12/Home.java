package hw12;

public class Home {
    public static void main(String[] args) {
        MobileDevice1 md1 = new MobileDevice1("iPhone", 128, "AT&T");
        System.out.println(md1.toString());
        md1.adapterType();
        System.out.println("Screen size - " + md1.displayDiagonal() + " inch");
        md1.operationSystem();
        System.out.println("Operating system version - " + md1.osVersion());

        System.out.println("***********************************");

        MobileDevice2 md2 = new MobileDevice2("Samsung", 256, "Verizon");
        System.out.println(md2.toString());
        md2.adapterType();
        System.out.println("Screen size - " + md2.displayDiagonal() + " inch");
        md2.operationSystem();
        System.out.println("Operating system version - " + md2.osVersion());

    }
}
