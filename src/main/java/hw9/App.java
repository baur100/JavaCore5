package hw9;

// 1. Создайте 3 класса в которых есть аттрибуты и методы
// 2. В классе App создайте функцию main() и создайте в ней по 2 объекта каждого класса - покажите как они работают
public class App {
    public static void main(String[] args) {
        System.out.println("\n========Class 1========");
//device 1
        Phone iPhone = new Phone();

        iPhone.Brand = "Apple";
        iPhone.Camera = 48;
        iPhone.Storage = 128;
        iPhone.Color = "Red";
        iPhone.ScreenSize = 5;

        iPhone.printPhone();
//device 2
        Phone SamsungS9 = new Phone();

        SamsungS9.Brand = "Apple";
        SamsungS9.Storage = 512;
        SamsungS9.Color = "Black";
        System.out.println("\n \n");

        SamsungS9.printPhone();

        System.out.println("\n========Class 2========");
//object 1
        Car Lamborghini = new Car();

        Lamborghini.Model = "Lamborghini Urus";
        Lamborghini.Color = "Blue";
        Lamborghini.Millage = 5310;
        Lamborghini.Year = 2018;
        Lamborghini.NewColor = "Orange";

        Lamborghini.printCar();

//object 2
        Car VW = new Car();
        VW.Model = "VW Passat B5";
        VW.Millage = 125021;
        VW.runCar();

        System.out.println("\n========Class 3========");
// Object 1
        Student Peter = new Student();

        Peter.Name = "Peter Skalzki";
        Peter.GraduateYear = 2021;
        Peter.Grade = "A+";
        Peter.DateOfBirth = "10/10/2003";

        Peter.Introduction();
        Peter.Graduation();

// Object 2
        Student Olga = new Student();

        Olga.Name = "Olga Unknown";
        Olga.Grade = "B";
        Olga.GraduateYear = 2012;

        Olga.Graduation();
    }
}
