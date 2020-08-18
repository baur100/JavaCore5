package lesson9;

public class House {
    public int sq;
    public int year;
    public int bd;
    public int bathr;
    public int price;
    public String address;

    public void printHouseInfo (String name){
        System.out.println("Name object = "+name);
        System.out.println("Square feet = "+sq);
        System.out.println("Year= "+year);
        System.out.println("Bedrooms = "+bd);
        System.out.println("Bathrooms= "+bathr);
        System.out.println("Address = "+address);
        System.out.println("Current price = "+sq);
    }
}
