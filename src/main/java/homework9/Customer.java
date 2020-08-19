package homework9;

public class Customer {
    public String fullname;
    public int years_as_a_customer;
    public double profit;
    public String date_of_birth;

    public void customers_data(){
        System.out.println("Value customer " + fullname + " (" +date_of_birth+ ") with us for " +years_as_a_customer +" years and he/she brought us profit of " + profit +"$");
    }

    public void ptintInfo() {
        System.out.println("Customer: " +
                "Full name='" + fullname + '\'' +
                ", Years as a customer=" + years_as_a_customer +
                ", Profit=" + profit + "$"+
                ", Date of birth='" + date_of_birth + '\'' );
    }
}
