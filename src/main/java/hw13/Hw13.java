package hw13;

import java.util.ArrayList;

public class Hw13 {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("Audi");
        car.add("Mercedes");
        car.add("BMW");
        car.add("GMC");
        car.add("Tesla");

        car.forEach(c-> System.out.println(c));
        System.out.println("***********************************");



        ArrayList<Integer> model = new ArrayList<>();
        model.add(5);
        model.add(600);
        model.add(750);
        model.add(425);
        model.add(3);

        model.forEach(x-> System.out.println(x));
        System.out.println("*****************************************");


        ArrayList<House> saleHouse = new ArrayList<>();
        saleHouse.add(new House("Austin",300000));
        saleHouse.add(new House("Seattle",60000));
        saleHouse.add(new House("Sacramento",700000));
        saleHouse.add(new House("Miami",500000));

        saleHouse.forEach(v-> System.out.println(v));





    }
}
