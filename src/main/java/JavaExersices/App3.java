package JavaExersices;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        String string = "whatever";
        String reverse = new StringBuffer(string).reverse().toString();
        String number = "12345";
        String numberReverse = new StringBuffer(number).reverse().toString();
        System.out.println(reverse);
        System.out.println(numberReverse);
    }
}
