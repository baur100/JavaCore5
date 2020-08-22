package lesson13;

public class App {
    public static void main(String[] args) {
        int xx=5;
        int b=xx;
        b=50;
//        System.out.println(xx);


        Integer xx1 = 5;

        double vv= 2.5;
        Double vv1 = 2.5;

        char cc='j';
        Character cc1 = 'j';

        boolean bb = true;
        Boolean bb1=true;

        Person jake = new Person("Jake Pense",2000);
        Person p1 = jake;

        p1.setYear(1990);
//        System.out.println(jake.getYear());

        int[] arr = {5,10};
        int[] b1=arr;

        b1[0]=100;
//        System.out.println(arr[0]);


        Integer rr = 50;
        Integer tt=rr;
        tt=100;
        System.out.println(rr);

        Person realCopy = jake.copy();

    }
}
