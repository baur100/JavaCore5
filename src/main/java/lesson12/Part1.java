package lesson12;

public class Part1 {
    public static void main(String[] args) {
        DesctopLight ge11= new DesctopLight("GE","11",30);
        ge11.bulbStandart();
        ge11.contacts2();
        ge11.switchOn();

        Vacuum lg14= new Vacuum("LG","14",2000,400);
        lg14.contacts2();
    }
}
