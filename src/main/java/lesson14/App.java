package lesson14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("Germany","Berlin");
        map.put("UK","London");
        map.put("Ireland","Dublin");
        map.put("USA","Washington");
        System.out.println(map);

        System.out.println(map.get("USA"));
        map.put("Germany","Bonn");
        System.out.println(map);
        map.put("Puerto-Rico","Washington");
        System.out.println(map);
        map.replace("Germany","Berlin");
        System.out.println(map);

        Map<String,Colors> fruits = new HashMap<>();
        fruits.put("Apple",Colors.GREEN);
        fruits.put("Orange",Colors.ORANGE);
        fruits.put("Peach",Colors.RED);

        System.out.println(fruits.size());

        for (String v: fruits.keySet()){
            System.out.println(v);
        }
        for (Colors c:fruits.values()){
            System.out.println(c);
        }
        for (Map.Entry<String,Colors> set:fruits.entrySet()){
            System.out.println(set.getKey());
            System.out.println(set.getValue());
        }

        Map<Integer,Character> map1 = new HashMap<>();
        Map<String,Person> peopleMap = new HashMap<>();
        peopleMap.put("Jake",new Person("Jake Dowson",1989));

        Map<String, List<Person>> xx= new HashMap<>();

    }
}
