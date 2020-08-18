package hw810;

public class Employees {

    public String EmpName;
    public String EmplLastname;
    public Department department;
    public int positionNumber;

    public void printEmplInfo(){
        System.out.println("Employee Name is " + EmpName);
        System.out.println("Employee Last name is "+ EmplLastname);
        System.out.println("Employee " + EmpName + EmplLastname + " works in " + department);
        System.out.println("Employee " + EmpName + EmplLastname + " position number is "+ positionNumber);


    }


}
