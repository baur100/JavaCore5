package HW8;

public class Person {

    private String profession;
    private String gender;
    private int age;
    private String location;


    public Person(String profession, String gender, int age, String location) {
        this.profession = profession;
        this.gender = gender;
        this.age = age;
        this.location = location;
    }


    public String getProfession() {
        return profession;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }


    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }



    public void printPersonInfo () {
        System.out.println("Person{" +
                "profession='" + profession + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}');
    }
}


