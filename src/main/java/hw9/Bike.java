package hw9;

public class Bike {
    public String brand;
    public String model;
    public int year;
    public String type;
    public String color;


    public void PrintBikeInfo(){
        System.out.println(brand+" "+model+" "+year+" "+type+" "+color);

    }

    public void drive(){
        System.out.println("My Bike "+brand+" model "+model+" of "+year+" needs "+type );

    }



}
