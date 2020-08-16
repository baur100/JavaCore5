package hw9;

public class Company {
    public String name;
    public int year;
    public String founder;
    public int emploees;
    public String adress;


    public void printCompanyInfo(){
        System.out.println("Company name is "+name);
        System.out.println("Main adress is " +adress);
        System.out.println("Number of employees "+emploees);
        System.out.println("Founded by "+founder+" in "+year);


    }


}
