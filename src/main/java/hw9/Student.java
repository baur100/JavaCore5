package hw9;

public class Student {
    public String Name;
    public String DateOfBirth;
    public int GraduateYear;
    public Phone CurrentDevice;
    public String Grade;


    public void Introduction(){
        System.out.println("Hey, I'm " + Name + ". My date of birth is: " + DateOfBirth +
                " And, I'm using " + CurrentDevice + "\n");
    }

    public void Graduation(){
        System.out.println("Hey, I'm " + Name + ". My current grade is: " + Grade + ", and my graduation year is: "
        + GraduateYear);
    }
}
