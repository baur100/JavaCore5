package lesson14;

import java.util.HashMap;
import java.util.Map;

// COLLECTION HASHMAP
public class Part1 {
    public static void main(String[] args) {

        HashMap<String, String> map1 = new HashMap<String, String>(); // 2 составляющие  key/ value
      map1.put ("Germany","berlin")    ;                        // key должен быть уникальным

    HashMap<String,String> map = new HashMap<>();
        map.put("Germany","Berlin");
        map.put("UK","London");
        map.put("Ireland","Dublin");
        System.out.println(map);

    }
}
