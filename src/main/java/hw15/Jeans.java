package hw15;

public class Jeans implements Size{

    public String color;
    public String size;

    public Jeans(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void sizeStandard() {

        System.out.println("I like my jeans");

    }
}
