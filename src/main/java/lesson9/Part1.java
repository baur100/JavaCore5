package lesson9;

public class Part1 {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.brand = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2015;
        myCar.drive();

        Car MichaelCar=new Car();
        MichaelCar.brand = "Honda";
        MichaelCar.model = "Civic";
        MichaelCar.year = 2019;
        MichaelCar.color=Colors.BLACK;

        System.out.println(MichaelCar.brand +" " + MichaelCar.model+" " + MichaelCar.year+" " + MichaelCar.color);
        MichaelCar.drive();
        MichaelCar.beep();

        //Persons
        Person John= new Person();
        John.name="John";
        John.lastname="Hopkins";
        John.year=1994;
        John.gender=Gender.MALE;
        John.sayHi("Mary");

        Person Mary=new Person();
        Mary.name="Mary";
        Mary.lastname="Erikson";
        Mary.year=1995;
        Mary.gender=Gender.FEMALE;

    }
}
