package lesson11;

public class Part1 {
    public static void main(String[] args) {
        Address student1Address = new Address("122 Lincoln Ave", "", "Hackensack", "NJ", 7202);
        Subject[] listOfSubjects = {Subject.BIOLOGY, Subject.HISTORY, Subject.ECONOMICS};

        Student student1 = new Student("Anna", "Gold", student1Address, listOfSubjects, -1890, Subject.BUSINESS);
        System.out.println(student1Address);
        student1.setYearOfBirth(1970);
        System.out.println(student1);

        Address teacherAddress = new Address("apt1212, bld 5", "Hanna st", "Trenton", "NJ", 87880);
        Teacher teacher1 = new Teacher("Steven", "Mr.Jons", teacherAddress, 1500, Subject.MATH);
        teacher1.setYearOfBirth(1970);
        System.out.println(teacher1);
    }
}
