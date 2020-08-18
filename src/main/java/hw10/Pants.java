package hw10;

public class Pants {
    private Size sizes;
    private String brand;
    private String Type;
    private int NumbersOfPockets;

    public Pants(Size sizes, String brand, String type, int numbersOfPockets){
        this.sizes=sizes;
        this.brand=brand;
        this.NumbersOfPockets=numbersOfPockets;
        this.Type=type;
    }
    public void setBrand(String Brand) {
        this.brand = Brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setType(String type){
        this.Type=type;
    }
    public String getType(){
        return Type;
    }
    public void setNumbersOfPockets(int number){
        this.NumbersOfPockets=number;
    }
    public int getNumbersOfPockets(){
        return NumbersOfPockets;
    }
    public void setSize(Size size){
        this.sizes=size;
    }
    public Size getSizes(){
        return sizes;
    }

    public void showPants(){
        System.out.println("My love " + Type + " style of the pants, and this is originally from " + brand
                + " brand. I'm using "+ sizes + " size, and it's having " + NumbersOfPockets + " pockets.");
    }

}
