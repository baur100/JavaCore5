package Lesson11;
//HW 14
//
//        1. Создать один супер и 2 или 3 детских
//        2. Создать объекты с глубиной в 3 класса  создать объект и вытащить объект при помощи геттеров
public class App {
    public static void main(String[] args){

        College collegeInfo = new College ("SDSU"," 5500 Campanile Drive", "San Diego", "CA", 92182);
        System.out.println("==============================================================================================");
        System.out.println(collegeInfo);
        System.out.println("==============================================================================================");

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        Address studentAddress = new Address("13352 Torrey Meadows DR", "San Diego","CA", 92129);
        Subjects[] listOfSubjects = {Subjects.ALGEBRA,Subjects.ECONOMICS,Subjects.BUSINESS,Subjects.COMPUTER_SCIENCE};

        Student vlad = new Student("Vlad", "Chekhovskyi", studentAddress, 1999, Subjects.COMPUTER_SCIENCE, listOfSubjects);
        vlad.setYearOfBirth(1995);
        System.out.println(vlad);
        System.out.println("Hello, I am a student of " + collegeInfo.collegeName + " and my name is " + vlad.name + " " + vlad.lastName + ","+ " I was born in "+ vlad.yearOfBirth);
        System.out.println("==============================================================================================");
        System.out.println("I take classes such as " + Subjects.COMPUTER_SCIENCE +","+ Subjects.ALGEBRA +","+ Subjects.ECONOMICS +","+ Subjects.BUSINESS);
        System.out.println("==============================================================================================");

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        Address teacherAddress = new Address("2165 Cambridge Ave", "Encinitas","CA", 92007 );
        Teacher msCavanagh = new Teacher("Jeanne","Cavanagh", teacherAddress, 1980, Subjects.ECONOMICS);
        System.out.println("==============================================================================================");
        System.out.println(msCavanagh);
        System.out.println("==============================================================================================");

    }
}
