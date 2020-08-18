package hw9;

public class Food {
    public String name;
    public String taste;
    public int storingtemperature;

    public void PrintFood(){
        System.out.println("This is "+ name+ ", it has "+ taste+" taste.");
    }
    public void StoreFood(){
        if (storingtemperature>=40){
            System.out.println(name+" need to be stored in the pantry.");
        }
        else{
            System.out.println(name+" need to be refridgerated.");
        }
    }
}
