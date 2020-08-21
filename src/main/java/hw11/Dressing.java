package hw11;

import java.util.Arrays;

public class Dressing {

    private Brands[] brand;
    private Stores[] store;
    private String type;
    private int price;

    public Dressing() {
    }

    public Dressing(Brands[] brand, Stores[] store, String type, int price) {
        this.brand = brand;
        this.store = store;
        this.type = type;
        this.price = price;
    }

    public Brands[] getBrand() {
        return brand;
    }

    public void setBrand(Brands[] brand) {
        this.brand = brand;
    }

    public Stores[] getStore() {
        return store;
    }

    public void setStore(Stores[] store) {
        this.store = store;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printDressing(){
        System.out.println("Hey! \n I just bought a " + type + " in " + Arrays.toString(store) +
                " store, and it cost only $" + price + " dollars, and this is a "+Arrays.toString(brand) + " brand.");
    }
}
