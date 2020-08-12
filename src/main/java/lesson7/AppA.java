package lesson7;

public class AppA {
    public static void main(String[] args) {
        System.out.println(getTicketPrice(1000,120));

    }
    public static double getTicketPrice(int fare, int age){
        if(age<3) {
            return 0;
        }
        if(age<13){
            return fare*0.5;
        }
        if(age<66){
            return fare;
        }
        return fare*0.8;
    }

}
