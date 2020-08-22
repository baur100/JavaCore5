package work14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Work140 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Germany", "Berlin");
        map.put("UK", "London");
        map.put("Ireland", "Dublin");
        map.put("USA", "Washington");
        System.out.println(map);

        map.put("Germany", "Bonn");
        System.out.println(map);
        map.put("Puerto-Rico", "Washington");
        System.out.println(map);
        map.replace("Germany", "Berlin");
        System.out.println(map);

        Map<String, Colors> fruits = new HashMap<>();
        fruits.put("Apple", Colors.GREEN);
        fruits.put("Orange", Colors.ORANGE);
        fruits.put("Peach", Colors.RED);
        System.out.println(fruits.size());

        for (String v : fruits.keySet()) {
            System.out.println(v);
        }
        for (Colors c : fruits.values()) {
            System.out.println(c);
        }

        for (Map.Entry<String, Colors> set : fruits.entrySet()) {
            System.out.println(set.getKey());
            System.out.println(set.getValue());

            Map<Integer, Character> map1 = new HashMap<>();


        }
    }
}

