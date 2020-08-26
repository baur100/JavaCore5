package lesson13;

public class Person {
    private String fullName;
    private int year;

    public Person(String fullName, int year) {
        this.fullName = fullName;
        this.year = year;
    }

    public Person() {
    }

    public Person copy(){
        return new Person(this.fullName,this.year);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", year=" + year +
                '}';
    }
}
