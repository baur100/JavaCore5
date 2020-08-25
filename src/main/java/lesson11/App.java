package lesson11;

public class App {
    public static void main(String[] args) {
        Address studentAddress = new Address("122 Lincoln ave","","Hackensack","NJ",07202);
        Subjects[] listOfSubjects = {Subjects.BIOLOGY,Subjects.BUSINESS,Subjects.ECONOMIC,Subjects.HISTORY};

        Student anna = new Student("Anna","Gold",studentAddress,listOfSubjects,2000,Subjects.ECONOMIC);
        anna.setYearOfBirth(1971);

//        System.out.println(studentAddress);
//        System.out.println(anna);

        Address teacherAddress = new Address("apt 1212, Building 5", "Hanna st", "Trenton","NJ",20220);

        Teacher mrJones = new Teacher("Steven","Jones",teacherAddress,1985,Subjects.MATH);

        anna.sayHello();
        mrJones.sayHello();
        anna.printStudent();

        Person p1 = anna;
        Person p2 = mrJones;

        Person p[] = {p2,anna};

//        Student xx = new Person("Steven","Jones",teacherAddress,1985);
    }
}
