package lesson10;

public class Student {
    private String name;
    private String lastName;
    private String collegeName;
    private Subjects major;
    private Subjects[] subjects;

    public Student(String name, String lastName, String collegeName, Subjects major){
        this.name = name;
        this.collegeName = collegeName;
        this.lastName = lastName;
        this.major = major;
    }

    public void setSubjects(Subjects[] subjects) {
        this.subjects = subjects;
    }

    public Subjects[] getSubjects() {
        return subjects;
    }

    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String getCollegeName(){
        return collegeName;
    }
    public Subjects getMajor(){
        return major;
    }

    public void setName(String name) {
        this.name=name;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setCollegeName(String collegeName){
        this.collegeName = collegeName;
    }
    public void setMajor (Subjects newMajor){
        this.major = newMajor;
    }
    public void printInfo() {
        System.out.println( "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", major=" + major +
                '}');
        for (Subjects s: this.subjects){
            System.out.println(s);
        }
    }
}
