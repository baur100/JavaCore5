package Lesson9;

public class App1 {
    public static void main(String[]args) {
        Person sasha = new Person();
        Person tanya = new Person();

        sasha.name = "Sasha";
        sasha.lastName = "Petrov";
        sasha.year = 1969;
        sasha.gender = Gender.MALE;

        tanya.name = "Tanya";
        tanya.lastName = "Petrova";
        tanya.year = 1970;
        tanya.gender = Gender.FEMALE;

        sasha.calls("Jeff's Phone");
        sasha.sayHi("Jeff");
        sasha.says("to give him MacKenzie's phone number because he's wife Tanya lost it");

        tanya.dialing("MacKenzie's Phone");
        tanya.sayHi("MacKenzie");





    }
}
