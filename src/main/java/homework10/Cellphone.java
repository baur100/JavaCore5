package homework10;


public class Cellphone {
    private String brand;
    private String model;
    private String display;
    private int RAM;
    private int memory;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getDisplay() {
        return display;
    }

    public int getRAM() {
        return RAM;
    }

    public int getMemory() {
        return memory;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Cellphone() {
    }

    public Cellphone(String b, String m, String d, int ram, int me) {
        this.brand = b;
        this.model = m;
        this.display = d;
        this.RAM = ram;
        this.memory = me;

    }

    public void printCellphone() {
        System.out.println("Cellphone: " +
                "Brand- " + brand +
                ", Model- " + model +
                ", Display type- " + display +
                ", RAM- " + RAM + "Gb" +
                ", Memory- " + memory +"Gb");
    }
}
