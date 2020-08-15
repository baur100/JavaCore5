package hw8;

public class Part1 {
    public static void main(String[] args) {
        //Ex #1 - EmailDomain
        EmailDomain facebook = EmailDomain.EMAIL_GOOGLE;
        EmailDomain vkontakte = EmailDomain.EMAIL_MAIL;
        EmailDomain offerup = EmailDomain.EMAIL_YAHOO;

        offerup=EmailDomain.EMAIL_YANDEX;

        System.out.println("Please use for sign up email type - " + facebook);
        System.out.println("Please use for sign up email type - " + vkontakte);
        System.out.println("Please use for sign up email type - " + offerup);
        System.out.println("=======================Ex #2=====================");

        //Ex #2 - STEAK
        Steaks[] menu= {Steaks.MEDIUM_RARE,Steaks.MEDIUM, Steaks.WELL_DONE};
        for(Steaks v:menu) {
            System.out.print(v +", ");
        }
        //Ex #3
        System.out.println();
        System.out.println("=======================Ex #3=====================");
        Steaks order1=Steaks.MEDIUM_WELL;
        Steaks order2= Steaks.MEDIUM_RARE;
        Steaks order3=Steaks.WELL_DONE;
        System.out.println("Order 1 - steak " + order1);
        System.out.println("Order 2 - steak " + order2);
        System.out.println("Order 3 - steak " + order3);
    }
}
