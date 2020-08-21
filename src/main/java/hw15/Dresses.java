package hw15;

public class Dresses implements Size {

    public String model;
    public int size;

    public Dresses(String model, int size) {
        this.model = model;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void sizeStandard() {
        System.out.println("I like my dress");

    }
}
