package lesson10;

import lesson11.Subjects;

public class App {
    public static void main(String[] args) {
        Person david = new Person("David", "Shane", 1985, Gender.MALE);
        Person dave = new Person();
        Person helen = new Person("Helen","Hunter", 1988);

        Student oleg = new Student("Oleg","Petrov","MIT", Subjects.BIOLOGY);


        System.out.println(oleg.getCollegeName());
        oleg.setLastName("Petroff");
        System.out.println(oleg.getLastName());

        Subjects[] subjs = {Subjects.BIOLOGY,Subjects.MATH,Subjects.CS};
        oleg.setSubjects(subjs);
        oleg.printInfo();

    }
}
