package hw19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static  void main(String[] args) {
        Address farm1 = new Address("345 holly st","Northills","CA",98765);
        Address farm2 = new Address("456 sirri ave","Nonbai","TN",34009);

        AgriCultural livestock = new AgriCultural("Livestock Ranching","stock whip");
        AgriCultural shiftingCultivation = new AgriCultural("Shifting Cultivation","machetes");
        AgriCultural subsistenceFarming = new AgriCultural("Subsistence Farming","Hand Sickle");

        List<AgriCultural> agriCulturals = new ArrayList<>();
        agriCulturals.add(livestock);
        agriCulturals.add(shiftingCultivation);
        agriCulturals.add(subsistenceFarming);

        Map<Cattle,Integer> cattle = new HashMap<Cattle,Integer>();
        cattle.put(Cattle.COWS,5);
        cattle.put(Cattle.CHICKEN,20);
        cattle.put(Cattle.PIGS,12);
        cattle.put(Cattle.SHEEPS,10);
        cattle.put(Cattle.TURKEYS,18);

        Farm f1 = new Farm("Lola",farm1,cattle,agriCulturals,"livestock",3);
        f1.printInfo();

    }
}
