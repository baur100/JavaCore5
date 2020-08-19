package hw10;

public class Pants {
    private Size sizes;
    private String brand;
    private String type;
    private int numbersOfPockets;

    public Pants(Size sizes, String brand, String type, int numbersOfPockets){
        this.sizes=sizes;
        this.brand=brand;
        this.numbersOfPockets = numbersOfPockets;
        this.type = type;
    }

    public Pants(){}

    public void setBrand(String Brand) {
        this.brand = Brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setType(String type){
        this.type =type;
    }
    public String getType(){
        return type;
    }
    public void setNumbersOfPockets(int number){
        this.numbersOfPockets =number;
    }
    public int getNumbersOfPockets(){
        return numbersOfPockets;
    }
    public void setSize(Size size){
        this.sizes=size;
    }
    public Size getSizes(){
        return sizes;
    }

    public void showPants(){
        System.out.println("My love " + type + " style of the pants, and this is originally from " + brand
                + " brand. I'm using "+ sizes + " size, and it's having " + numbersOfPockets + " pockets.");
    }

}
