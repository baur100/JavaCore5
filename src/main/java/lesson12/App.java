package lesson12;

public class App {
    public static void main(String[] args) {
        DesktopLight ge11 = new DesktopLight("GE","11",30);
//        ge11.bulbStandard();
//        ge11.contacts2();
//        ge11.switchOn();

        Vacuum lg14 = new Vacuum("LG","14",2000,400);
//        lg14.contacts2();

        AmericanPowerSocket dl = new DesktopLight("Philips","B2",25);
        AmericanPowerSocket va = new Vacuum("LG","E34",2000,580);

        AmericanPowerSocket[] devices = {dl,va};

        for (AmericanPowerSocket v: devices){
            v.contacts2();
        }

//        Person p = new Person();

    }
}
