package hw9;

public class Season {
    public String name;
    public int number;
    public int temperature;


    public void PrintSeason(){
        System.out.println(name +" is a season # "+ number + " with average temperature "+temperature +"F.");
    }
    public void HotOrCold(){
        if (temperature >=75){
            System.out.println(name + " is a hot season.");
        }
        else{
            System.out.println(name + " is a cold season.");
        }
    }
}
