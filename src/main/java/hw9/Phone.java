package hw9;

public class Phone {
    public String make;
    public String model;
    public String os;
    public int version;
    public String voiceSearch;

    public void myPhoneInfo() {
        System.out.println("My cell phone - " + make + " " + model + version);
        System.out.println("Cell phone OS - " + os);
        System.out.println();

    }

    public void callMyWife() {
        System.out.println("...Hey " + voiceSearch + "! " + "Call my wife, please...");

    }
}
