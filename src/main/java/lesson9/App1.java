package lesson9;

public class App1 {
    public static void main(String[] args) {
        Person ivan = new Person();
        Person dasha = new Person();
        Person jack = new Person();

        ivan.name = "Ivan";
        ivan.year = 1990;
        ivan.lastName = "Mukhin";
        ivan.gender = Gender.MALE;

        ivan.lastName = "Mishkin";
//        ivan.sayHi("Jonny");


//        System.out.println(ivan.lastName);
//        System.out.println(ivan.name);
//        System.out.println(ivan.gender);


        House obj287 = new House();
        obj287.address = "123 Pumpkin st, SparrowTown, PA";
        obj287.bathrooms = 2;
        obj287.bedrooms = 3;
        obj287.sq = 2000;
        obj287.year = 2009;
        obj287.price = 225000;

        obj287.printHouseInfo();

        House obj322 = new House();
        obj322.address = "455 Ariel Ct, SparrowTown, PA";
        obj322.bathrooms = 4;
        obj322.bedrooms = 2;
        obj322.sq = 2100;
        obj322.year = 2019;
        obj322.price = 235000;

        obj322.printHouseInfo();

    }
}
