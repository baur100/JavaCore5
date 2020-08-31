package hw8emun;

public class App8 {
    public static void main(String[] args) {

        System.out.println(" ex 1");

        Birds brd = Birds.CANARY;
        Birds brd1 = Birds.SWAN;
        System.out.println(brd);
        System.out.println(brd1);

        System.out.println("*******");

        brd1 = Birds.DUCK;
        System.out.println(brd1);

        System.out.println("*******");

        Birds[] tree = {Birds.CANARY, Birds.DUCK, Birds.SWAN, Birds.PIGEON};
        for (Birds v : tree) {
            System.out.println(v);
        }

        System.out.println(" ex 2");

        Flowers flora = Flowers.PEONY;
        Flowers flora1 = Flowers.TULIP;
        System.out.println(flora);
        System.out.println(flora1);

        System.out.println("*******");

        flora = Flowers.JASMINE;
        System.out.println(flora);

        System.out.println("*******");

        Flowers[] bouquet = {Flowers.PEONY, Flowers.LILY, Flowers.VIOLET, Flowers.JASMINE};
        for (Flowers v : bouquet) {
            System.out.println(v);
        }


    }

}


// HW - Create 2 enums
//Create 3 variable of each enum - one is array