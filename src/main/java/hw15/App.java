package hw15;
//Create an interface and 2 classes which implements it. Create 2 objects of each class. Assign one object to interface type
public class App {

    public static void main(String[] args) {

        Dresses dress = new Dresses("Black small dress", 4);
        dress.sizeStandard();

        Jeans jeans = new Jeans("Blue", "S");
        jeans.sizeStandard();

    }
}
