package HW8;

public class App8 {

    public static void main(String[] args) {

        //Enums

       Computer good = Computer.LINUX;
       Computer medium = Computer.WINDOWS;
       Computer[] theBest = {Computer.MAC, Computer.LINUX};
       Monitor large = Monitor.MAC;
       Monitor medium2 = Monitor.DELL;
       Monitor[] set = {Monitor.DELL, Monitor.TOSHIBA, Monitor.MAC};


       Person teacher = new Person("Teacher", "male", 34, "Boston");
       Person student = new Person("Student", "female", 23, "New York");

       Aircraft boeng = new Aircraft("green", "large", "superLarge", 23456);
       Aircraft airbus = new Aircraft("white", "avergae", "medium", 334567);


       Car mazda = new Car("I78UI", 2010, "blue", 23455);
       Car mersedes = new Car("HGTHH", 2018, "white", 657473);

       mazda.printCarInfo();
       mersedes.printCarInfo();

       boeng.printAircraftData();
       airbus.printAircraftData();

       teacher.printPersonInfo();
       student.printPersonInfo();


       student.setGender("male");
       System.out.println(student.getGender());

       mazda.setMillage(465444);
       System.out.println(mazda.getMillage());

    }
}
