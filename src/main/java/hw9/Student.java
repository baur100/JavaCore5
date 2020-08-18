package hw9;

public class Student {
    int idStudent;
    String name;
    String lastname;
    Course course;
    Object object;

    public void information(int id){
        idStudent=id;
//        name=n;
//        lastname=ln;
//        course=c;
//        object=o;
        System.out.println("==========Student Information==========");
        System.out.println("Student "+id);
        System.out.println("Name "+ name+". Last name "+lastname);
        System.out.println("Course "+ course + ". Object "+object);
        System.out.println("=======================================");

    }
}
