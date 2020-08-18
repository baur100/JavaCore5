package hw9;

import java.util.Arrays;

public class Teacher {
    private String name;
    private String lastname;
    private int experience;
    private Object object;
    private Course[] courses;

    public Teacher(String n, String ln, int ex, Object obj, Course[] cs) {
        name = n;
        lastname = ln;
        experience = ex;
        object = obj;
        courses = cs;
    }

    public String PrintCourses() {
        return Arrays.toString(courses);
    }

    public void couch() {
        System.out.println("==============TEACHER INFORMATION================");
        System.out.println(name + " " + lastname + " teacher of " + object + " with " + experience + " years of experience.");
        System.out.println("List of COURSES: ");
        System.out.println(PrintCourses());
    }
//    public void list(Course[] crs) {         НЕ РАБОТАЕТ
//        for (Course y : courses) {
//            System.out.println(y);
//        }
}
