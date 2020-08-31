package hw17;

import javaslang.collection.Array;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        HashMap<Cattle,Integer> cattle1 = new HashMap<Cattle,Integer>();
        cattle1.put(Cattle.CHICKENS,100);
        cattle1.put(Cattle.GEESE,80);
        cattle1.put(Cattle.TURKEY, 90);

        ArrayList<AgreeCultural> ac1=new ArrayList<>();
        ac1.add(new AgreeCultural("Millet",5));
        ac1.add(new AgreeCultural("Wheat",3));
        ac1.add(new AgreeCultural("Corn",4));

        Farm f1=new Farm("PennDutch",
                new Address("333 S 23th ave","Homestead","FL",33000),
                cattle1, ac1);
        f1.printInfo();
    }
}
