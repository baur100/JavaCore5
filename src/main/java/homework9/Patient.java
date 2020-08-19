package homework9;

import java.util.Date;

public class Patient {
    public String name;
    public String surname;
    public int  yearofbirth;
    public String pcp_doctor;
    public String health_condition;


    public void last_visit(){
        Date d1 = new Date();
        System.out.println("Patient "+ name +" " + surname +" last visit was on " +d1 +" to " +pcp_doctor+ " and the patient's current health condition is "+health_condition);
    }

}
