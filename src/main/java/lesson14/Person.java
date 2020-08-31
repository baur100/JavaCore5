package lesson14;

public class Person {
    private String name;
    private String fullname;
    private int year;

    public Person(){};

    public Person(String name, String fullname, int year) {
        this.name = name;
        this.fullname = fullname;
        this.year = year;

    }
    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Person(int i, String john) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Person copyPerson(){   //Создаёт hard copy объекта
        return new Person(this.name,this.fullname,this.year);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fullname='" + fullname + '\'' +
                ", year=" + year +
                '}';
    }


}
