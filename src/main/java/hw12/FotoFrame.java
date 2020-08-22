package hw12;

public class FotoFrame implements Frame {
    private String shape;
    private String color;
    private String legFrame;


    public void angle() {
        System.out.println("I have angles.");
    }

    public void glass() {
        System.out.println("I have glass.");
    }

    public void picture() {
        System.out.println("Inside of me very cute photo.");
    }

    public FotoFrame(String shape, String color, String legFrame1) {
        this.shape = shape;
        this.color = color;
        this.legFrame = legFrame1;
    }

    public String printLeg() {
        String yes = "Yes";
        String have = "Have";
        String result;
        if (legFrame == yes || legFrame == have) {
           result=("I have a leg for best usability!");
        } else {
            result=("I don't have a leg. I prefer to located on the wall.");
        }
        return result;
    }

    public void infoFotoFrame() {
        System.out.println("==="+shape +" FOTO-FRAME INFORMATION====");
        System.out.println("I have shape: " + shape + ". Color: " + color + ". And " + printLeg() + ".");

    }
}
