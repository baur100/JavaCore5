package hw8;

public class APP {
    public static void main(String[] args) {
        Cars chev = Cars.CHEVROLET;
        Cars hon = Cars.HONDA;
        Cars nis = Cars.NISSAN;
        Stores st1 = Stores.ALPHA;
        Stores hov = Stores.HOVIK;

        System.out.println("I am selling " + chev + " in store " + st1);
        System.out.println("But i will go to, " + hov + " he have " + hon + " and " + nis);
        System.out.println("Now im choosing between: ");

        Cars[] all = {Cars.FIAT, Cars.FORD, Cars.TOYOTA, Cars.HONDA, Cars.CHEVROLET, Cars.NISSAN};
        for (Cars v : all)
            System.out.println("Maybe "+ v);


        System.out.println("########");
        Days[] day = {Days.SATURDAY, Days.FRIDAY, Days.MONDAY, Days.SUNDAY, Days.THURSDAY, Days.TUESDAY, Days.WEDNESDAY};
        for (Days v : day)
            System.out.println(v);

    }
}
