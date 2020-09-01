package HW19;

import HW18.Address;

import java.util.List;
import java.util.Map;

public class Farm {

    private String name;
    private Address address;
    private Map<Cattle, Integer> cattle;
    private List<AgreeCutural> agreeCutural;
    private String nameOfCuture;
    private int filesNumber;



    public void printInfo() {
        System.out.println("Farm{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", cattle=" + cattle +
                ", agreeCutural=" + agreeCutural +
                ", nameOfCuture='" + nameOfCuture + '\'' +
                ", filesNumber=" + filesNumber +
                '}');
    }
}
