package lesson9;

public class House {
    public int sq;
    public int year;
    public int bedrooms;
    public int bathrooms;
    public int price;
    public String address;

    public void printHouseInfo(){
        System.out.println("Square feet = "+sq);
        System.out.println("Year = "+year);
        System.out.println("Number of bedrooms = "+bedrooms);
        System.out.println("Number of bathrooms = "+bathrooms);
        System.out.println("Current price = "+price);
        System.out.println("Address = "+address);
    }
}
