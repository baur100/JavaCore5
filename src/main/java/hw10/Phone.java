package hw10;

import lesson10.Gender;

import java.util.Arrays;

public class Phone {
    private Brand[] brandphone;
    private int seria;
    private double price;
    private int amount;
    private String provider;

    //DEFAULT CONSTRUCTION
    public Phone() {
    }

    // CONSTRUCTIONS
    public Phone(Brand[] brand, int seria1, double price1, int amount1, String provider1) {
        brandphone = brand;
        seria = seria1;
        price = price1;
        amount = amount1;
        provider = provider1;
    }

    public Phone(Brand[] brand, int seria2, double price2, int amount2) {
        brandphone = brand;
        seria = seria2;
        price = price2;
        amount = amount2;
    }

    public Phone(Brand[] brand, int seria3, double price3) {
        brandphone = brand;
        seria = seria3;
        price = price3;
    }

    // SETTERS and GETTERS for each attribute
    public Brand[] getBrand() {
        return brandphone;
    }

    public void setBrand(Brand[] newBrand) {
        this.brandphone = newBrand;
    }

    public String printBrand() {
        return Arrays.toString(brandphone);
    }

    public int getSeria() {
        return seria;
    }

    public void setSeria(int newSeria) {
        this.seria = newSeria;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int newAmount) {
        this.amount = newAmount;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String newProvider) {
        this.provider = newProvider;
    }

    //FUNCTION for print ALL ATTRIBUTES
    public void printClass() {
        System.out.println("=======INFORMATION OF " + printBrand() + "=========");
        System.out.println("Brand of phone: " + printBrand()
                + ". Seria: " + seria
                + ". Current price: " + price
                + ". Amount: " + amount
                + ". Provider: " + provider);
    }
}
