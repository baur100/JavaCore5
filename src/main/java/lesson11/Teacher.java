package lesson11;

public class Teacher extends Person{
    private Subjects subj;

    public Teacher(String name, String lastName, Address address, int yearOfBirth, Subjects subj) {
        super(name, lastName,address,yearOfBirth);
        this.subj = subj;
    }

    public Subjects getSubj() {
        return subj;
    }

    public void setSubj(Subjects subj) {
        this.subj = subj;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subj=" + subj +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
