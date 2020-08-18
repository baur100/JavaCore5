package hw9;

public class Teacher {
   public String name;
    public String lastname;
    public int experience;
    public Object object;
   // public Course[] courses;    НЕ МОГУ СОЗДАТЬ АРРЕЙ ИЗ ENUM В ОБЪКТЕ


    public void couch(){
        System.out.println("==============TEACHER INFORMATION================");
        System.out.println( name+" "+ lastname+" teacher of "+object+" with "+experience+" years of experience");
        System.out.println( "List of COURSES: ");
    }
//    public void list(Course[] crs) {         НЕ РАБОТАЕТ
//        for (Course y : courses) {
//            System.out.println(y);
//        }
    }
