package lesson13;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
//        System.out.println(list);
        list.add("Fish");
//        System.out.println(list);
        list.add("Milk");
        list.add("Cherry");
//        System.out.println(list);
        list.add(1,"Flower");
//        System.out.println(list);
//        System.out.println(list.get(3));
        list.set(0,"Cheese");
//        System.out.println(list);
//        System.out.println(list.size());
        Boolean gotMilk = list.contains("Milk");
//        System.out.println(gotMilk);
        boolean v = list.remove("Cherry");
//        System.out.println(v);
//        System.out.println(list);

//        System.out.println(list.remove(1));
//        System.out.println(list);

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
//
//        for (Integer w: numbers){
//            if(w==5){
//                System.out.println(w);
//            }
//        }
//        numbers.forEach(x-> System.out.println(x));


        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Pink");
        System.out.println(colors);

        for (int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }
        for (String color:colors){
            System.out.println(color);
        }
        colors.forEach(x-> System.out.println(x));


        Person anna = new Person("Anna X",1990);
        Person jay = new Person("Jay Simpson",1990);

        List<Person> people = new ArrayList<Person>();
        people.add(anna);
        people.add(jay);
        people.add(new Person("Ivan V",1998));
        System.out.println(people.size());
        System.out.println(people.get(2).getFullName());

        List<Colors> c1 = new ArrayList<>();
        c1.add(Colors.GREEN);
        c1.add(Colors.GREEN);
        c1.add(Colors.RED);
        System.out.println(c1);
        System.out.println(people);
    }
}
