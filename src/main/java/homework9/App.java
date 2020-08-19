package homework9;

public class App {
    public static void main(String[] args) {
        Patient john = new Patient();

        john.name = "John";
        john.surname = "Williams";
        john.yearofbirth = 1975;
        john.pcp_doctor = "Dr.Lebowski";
        john.health_condition = "good";

        john.last_visit();

        Patient dazy = new Patient();

        dazy.name = "Dazy";
        dazy.surname = "McLaren";
        dazy.yearofbirth = 1992;
        dazy.pcp_doctor = "Dr.Karther";
        dazy.health_condition = "passably";

        dazy.last_visit();

        Customer nick = new Customer();
        nick.fullname = "Nick Kurtz";
        nick.date_of_birth = "06/02/85";
        nick.years_as_a_customer = 6;
        nick.profit = 167567.70;

        nick.customers_data();

        nick.ptintInfo();

        Customer clare = new Customer();
        clare.fullname = "Clare Crawley";
        clare.date_of_birth = "01/24/61";
        clare.years_as_a_customer = 3;
        clare.profit = 285765.90;

        clare.customers_data();

        clare.ptintInfo();

        AC samsung = new AC();
        samsung.brand = "Samsung";
        samsung.model = "MLB71";
        samsung.warranty = 3;
        samsung.installation_type = "On the wall";
        samsung.control_type = "auto/manual/remote";
        samsung.BTU = 12000;

        samsung.Print_AC_info();

        AC lg = new AC();
        lg.brand = "LG Electronics";
        lg.model ="DC11";
        lg.warranty = 5;
        lg.installation_type = "Into the window";
        lg.control_type = "auto/remote";
        lg.BTU = 10000;

         lg.Print_AC_info();


    }
}
