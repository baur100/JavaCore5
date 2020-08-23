package hw13;

import lesson14.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForHash {
    public static void main(String[] args) {
        HashMap<String,Integer> colors = new HashMap<>();
        colors.put("Blue",1);
        colors.put("Red",2);
        colors.put("Black",3);

        for(String v: colors.keySet()) {
            System.out.println(v+" Colors ");
        }

        HashMap<String,Integer> house = new HashMap<>();
        HashMap<String,House> sale = new HashMap<>();
        sale.put("H1", new House("Dallas",400000));
        sale.put("H2", new House("Chicago",800000));
        sale.put("H3", new House("Atlanta",400000));

        for (String h: sale.keySet()){
            System.out.println(h+" Houses ");
        }
        for (Map.Entry<String,House> set: sale.entrySet()){
            System.out.println(set.getKey());
            System.out.println(set.getValue());
        }




    }
}
