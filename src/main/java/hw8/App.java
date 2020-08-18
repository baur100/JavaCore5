package hw8;


public class App {
    public static void main(String[] args) {
        System.out.println("Ex1");
        Drinks d = Drinks.COFFEE;
        Drinks m = Drinks.MATCHA;
        Drinks f = Drinks.SODA;
        Drinks g = Drinks.TEA;
        Drinks []arr = {Drinks.TEA, Drinks.SODA, Drinks.COFFEE, Drinks.MATCHA, Drinks.WINE};
        for (Drinks v: arr){
            System.out.println(v);
        }
        System.out.println(d);
        System.out.println(m);

        System.out.println(" ");

        System.out.println("Ex2");
        Vehicles x = Vehicles.CAR;
        Vehicles y = Vehicles.BUS;
        Vehicles z = Vehicles.TROLLEY;
        Vehicles [] pt = {Vehicles.BUS, Vehicles.TROLLEY,Vehicles.TRACTOR};
        for (Vehicles v:pt){
            System.out.println(v);
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
