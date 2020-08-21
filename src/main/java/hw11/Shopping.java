package hw11;

import java.util.Arrays;

public class Shopping {
    private Brands brand;
    private Stores[] store;
    private String name;
    private int savingAccount;

    public Shopping(Brands brand, Stores[] store, String name, int savingAccount) {
        this.brand = brand;
        this.store = store;
        this.name = name;
        this.savingAccount = savingAccount;
    }
    public Shopping(){}

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public Stores[] getStore() {
        return store;
    }

    public void setStore(Stores[] store) {
        this.store = store;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(int savingAccount) {
        this.savingAccount = savingAccount;
    }

    public void printShopping() {
        System.out.println("Shopping{" +
                "brand=" + brand +
                ", store=" + Arrays.toString(store) +
                ", name='" + name + '\'' +
                ", savingAccount=" + savingAccount +
                '}');
    }
}
