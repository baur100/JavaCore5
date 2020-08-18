package lesson9;

public class Part2 {
    public static void main(String[] args) {


        Person Ivan = new Person();
        Person Dasha = new Person();
        Person Jack = new Person();

        Ivan.name="Ivan";
        Ivan.lastname="Mukhin";
        Ivan.year=1985;
        Ivan.gender=Gender.MALE;
        Ivan.lastname="Mishkin"; // Ivan changed lastname


        System.out.println(Ivan.lastname);
        Ivan.sayHi("Jonny");
    }
}
