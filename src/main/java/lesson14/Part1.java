package lesson14;

import java.util.HashMap;
import java.util.Map;

// COLLECTION HASHMAP
public class Part1 {
    public static void main(String[] args) {

        HashMap<String, String> map1 = new HashMap<String, String>(); // 2 составляющие  key/ value
        map1.put ("Germany","Berlin")    ;                         // key должен быть уникальным
        map1.put("UK","London");
        map1.put("Ireland","Dublin");
        map1.put("USA","Washington");
        System.out.println(map1);

        System.out.println(map1.get("USA"));   // нет индексов, только уникальные ключи
        map1.put("Germany","Bonn");
        System.out.println(map1);
        map1.replace("Germany","Berlin");
        System.out.println(map1);


        Map<String,Colors> fruits=new HashMap<>();
        fruits.put("Apple",Colors.GREEN);
        fruits.put("Orange",Colors.ORANGE);
        fruits.put("Lemon",Colors.YELLOW);
        fruits.put("Peach",Colors.RED);
        System.out.println(fruits);
        System.out.println(fruits.size());

        for(String v: fruits.keySet()){   //Итеррация через ключи
            System.out.println(v);
        }
        for(Colors c: fruits.values()){   //Итеррация через значения
            System.out.println(c);
        }
        for(Map.Entry<String,Colors> set:fruits.entrySet()){
        System.out.println(set.getKey());
        System.out.println(set.getValue());
        }
        Map<Integer,Character> map = new HashMap<>();
        Map<String,Person> peopleMap= new HashMap<>();
        peopleMap.put("Jake", new Person("Jake","Dowson",1989));

    }
}
