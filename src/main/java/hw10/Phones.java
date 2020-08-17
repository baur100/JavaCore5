package hw10;

import hw10.Colors;

public class Phones {
    private String brand;
    private String model;
    private int year;
    private Colors color;
    private Colors[] colors;

    public Phones(){}
    public Phones(String brand, String model, int year,Colors color){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;

    }
    public String getBrand(){ return this.brand;}
    public String getModel(){ return this.model;}
    public int getYear(){ return this.year;}
    public Colors getColor(){ return this.color;}
    public Colors[] getcolors(){ return colors;}

    public void setColors(Colors[] colors){
        this.colors = colors; }


    public void setBrand(String brand){this.brand = brand;}
    public void setModel(String model){this.model = model;}
    public void setYear(int year){this.year = year;}
    public void setColor(Colors color){this.color = color;}
    public void PrintPhoneInfo(){
        System.out.println("My "+brand+" "+model+" is produced in "+year+" ");
        for(Colors p: this.colors);
    }



}
