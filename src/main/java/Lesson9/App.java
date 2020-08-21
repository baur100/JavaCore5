package Lesson9;

public class App {

//1. Создайте 3 класса в которых есть аттрибуты и методы
//2. В классе App создайте функцию main() и создайте в ней по 2 объекта
// каждого класса - покажите как они работают

    public static void main(String[] args) {
        Phone jeffsPhone = new Phone();

        jeffsPhone.brand = "Apple";
        jeffsPhone.model = "iPhone Xs Max";
        jeffsPhone.year = 2018;

        jeffsPhone.talk();

        Phone mackenziesPhone = new Phone();
        mackenziesPhone.brand = "Apple";
        mackenziesPhone.year = 2020;
        mackenziesPhone.model = "iPhone 11";

        mackenziesPhone.talk();

        jeffsPhone.model = "Jeffs iPhone Xs Max";
        mackenziesPhone.model = "Mackenzies iPhone 11";

        jeffsPhone.call();
        mackenziesPhone.ring();

        Person jeff = new Person();
        jeff.name = "Jeff";
        jeff.lastName = "Bezos";
        jeff.year = 1964;
        jeff.gender = Gender.MALE;

        Person mackenzi = new Person();
        mackenzi.name = "MacKenzi";
        mackenzi.lastName = "Scott";
        mackenzi.year = 1970;
        mackenzi.gender = Gender.FEMALE;

        jeff.sayHi("Mackenzi");
        mackenzi.sayHi("Jeff");









    }

}
