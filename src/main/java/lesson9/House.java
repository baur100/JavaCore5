package lesson9;

public class House {
    public int sq;
    public int year;
    public int bedrooms;
    public int bathrooms;
    public int price;
    public String address;

    public void printInfoHouse(){
        System.out.println("Adrees "+address);
        System.out.println("sq feet "+sq);
        System.out.println("Year "+year);
        System.out.println("Bedrooms "+bedrooms);
        System.out.println("Bathrooms "+bathrooms);
        System.out.println("Price "+price);
    }
}
