package hw9;

public class Beer {
    public String name;
    public String company;
    public int age;
    public Type type;


    public void PrintBeerInfo(){
        System.out.println("Brand "+name);
        System.out.println("Brewery "+company);
        System.out.println("Reserved "+age+" years");
        System.out.println("Type "+type);

    }
    public void LoveBeer(){
        System.out.println("I love to drink "+name+" "+type+" reserved for "+age+" years in cold weather!!!");
    }
}
