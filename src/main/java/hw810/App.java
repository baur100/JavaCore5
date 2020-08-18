package hw810;

public class App {
    public static void main(String[] args) {

        Colleges valencia = new Colleges();

        valencia.collegeName = "Valencia";
        valencia.county = "Orange County,Fl";
        valencia.studentsQnt = 5000;
        valencia.majors = Majors.ENGLISH;

        valencia.aboutCollege();

        Colleges techMath = new Colleges();

        techMath.collegeName = "Techmath";
        techMath.county = "Seminole";
        techMath. studentsQnt = 3600;
        techMath.majors = Majors.MATH;

        techMath.aboutCollege();

        Employees smith = new Employees();
        smith.EmpName = "John";
        smith.EmplLastname = "Smith";
        smith.department= Department.ACCOUNTING;
        smith.positionNumber = 1234567;

        smith.printEmplInfo();

        Employees doe = new Employees();
        doe.EmpName = "Josef";
        doe.EmplLastname = "Doe";
        doe.department= Department.HR;
        doe.positionNumber = 454545;

        doe.printEmplInfo();

        Friends nick = new Friends();
        nick.name = "Nick";
        nick.gender = Gender.BOY;
        nick.year = 2005;

        Friends olena = new Friends();
        olena.name = "Olena";
        olena.gender = Gender.GIRL;
        olena.year = 2007;

        nick.aboutYourself();
        nick.happyToSee("Olena");







    }
}
