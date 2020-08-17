package HW9;

import java.util.Arrays;

public class Animals {

    private String color;
    private int age;
    private Vaccines[] vaccinesDone;

    public Animals(String color, int age, Vaccines[] vaccinesDone) {
        this.color = color;
        this.age = age;
        this.vaccinesDone = vaccinesDone;
    }

    public Animals (){}


    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public Vaccines[] getVaccinesDone() {
        return vaccinesDone;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVaccinesDone(Vaccines[] vaccinesDone) {
        this.vaccinesDone = vaccinesDone;
    }

   @Override
    public String  toString() {
       return "Animals{" +
               "color='" + color + '\'' +
               ", age=" + age +
               ", vaccinesDone=" + Arrays.toString(vaccinesDone) +
               '}';
   }

   public void printArrayVaccines(Vaccines[] vaccinesDone){
        for(Vaccines v: vaccinesDone)
       System.out.println(v+" Vacine has been done");
   }
}
