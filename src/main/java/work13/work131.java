package work13;

import java.util.ArrayList;
import java.util.List;

public class work131 {


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
//        System.out.println(numbers);
//        System.out.println(numbers.size());

        for (Integer w: numbers){
            if(w==5){
//                System.out.println(w);
            }
        }
//        numbers.forEach((x-> System.out.println(x)));


        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Pink");
        System.out.println(colors);


        for (int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }

        for (String color: colors){
            System.out.println(color);
        }


        colors.forEach(x-> System.out.println(x));








        

    }
}
