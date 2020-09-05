package Lesson10;

import java.awt.*;

public class Groceries {

    private String IceCream;
    private String Milk;
    private String Cereal;
    private String Bread;
    private String Butter;

    public Groceries(String IceCream, String Milk, String Cereal, String Bread, String Butter){
        this.IceCream = IceCream;
        this.Milk = Milk;
        this.Cereal = Cereal;
        this.Bread = Bread;
        this.Butter = Butter;
    }
    public Groceries(){
    }
    public String getIceCream(){
        return IceCream;
    }
    public String getMilk(){
        return Milk;
    }

    public String getCereal(){
        return Cereal;
    }

    public String getBread() {
        return Bread;
    }

    public String getButter() {
        return Butter;
    }

    public void setIceCream(String iceCream) {
        this.IceCream = iceCream;
    }

    public void setMilk(String milk) {
        this.Milk = milk;
    }

    public void setCereal(String cereal) {
        this.Cereal = cereal;
    }
    public void setBread(String bread){
        this.Bread = bread;
    }

    public void setButter(String butter) {
        this.Butter = butter;
    }

    public void printGroceries(){
        System.out.println("When i go shopping at Walmart i get " + IceCream + " for the movie night" + " and " + Milk + "," + Cereal + "," + Bread + "," + Butter + " for the breakfast " );
    }
}



