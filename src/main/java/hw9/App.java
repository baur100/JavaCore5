package hw9;

public class App {
    public static void main(String[] args) {
        //objects of Class 1
        Girl a = new Girl();
        a.name = "Anna";
        a.age = 17;
        a.haircolor = "brunette";
        a.occupation= "student";
        a.PrintGirl();
        Girl b = new Girl();
        b.name = "Maria";
        b.age = 22;
        b.haircolor = "blonde";
        b.occupation = "waitress";
        b.PrintGirl();
        System.out.println(" ");
        //Objects of class 2
        Season au = new Season();
        au.name = "Autumn";
        au.number = 4;
        au.temperature = 70;
        Season sum = new Season();
        sum.name = "Summer";
        sum.number=3;
        sum.temperature = 90;
        au.PrintSeason();
        sum.PrintSeason();
        au.HotOrCold();
        sum.HotOrCold();
        System.out.println(" ");
        //Objects of class 3
        Food f = new Food();
        f.name = "Milk";
        f.taste = "sweet";
        f.storingtemperature = 30;
        f.StoreFood();
        f.PrintFood();
        Food g = new Food();
        g.name="Cookie";
        g.taste="sweet";
        g.storingtemperature=45;
        g.StoreFood();
    }
}
