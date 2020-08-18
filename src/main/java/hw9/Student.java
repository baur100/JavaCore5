package hw9;

public class Student {
    private int idStudent;
    private  String name;
    private String lastname;
    private Course course;
    private Object object;

    public Student(int id,String n,String ln, Course cs,Object obj){
        idStudent=id;
        name=n;
        lastname=ln;
        course=cs;
        object=obj;}

        public void infoStudent(){
        System.out.println("==========Student Information==========");
        System.out.println("Student "+idStudent);
        System.out.println("Name "+ name+". Last name "+lastname);
        System.out.println("Course "+ course + ". Object "+object);
        System.out.println("=======================================");

    }
}
