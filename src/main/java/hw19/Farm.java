package hw19;
import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private Map<Cattle,Integer> cattle;
    private List<AgriCultural>agriCultars;
    private String nameOfculure;
    private int fielsNumber;

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<AgriCultural> agriCultars, String nameOfculure, int fielsNumber) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agriCultars = agriCultars;
        this.nameOfculure = nameOfculure;
        this.fielsNumber = fielsNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(Map<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public List<AgriCultural> getAgriCultars() {
        return agriCultars;
    }

    public void setAgriCultars(List<AgriCultural> agriCultars) {
        this.agriCultars = agriCultars;
    }

    public String getNameOfculure() {
        return nameOfculure;
    }

    public void setNameOfculure(String nameOfculure) {
        this.nameOfculure = nameOfculure;
    }

    public int getFielsNumber() {
        return fielsNumber;
    }

    public void setFielsNumber(int fielsNumber) {
        this.fielsNumber = fielsNumber;
    }
    public void printInfo(){
        System.out.println("Farm name = "+ name);
        address.printInfo();
        System.out.println("We grow: ");
        cattle.forEach((k,v)-> System.out.println("Cattle: "+k+" - "+v));
        System.out.println("Most we r doing: ");
        agriCultars.forEach(x->x.printInfoAgricultural());
        System.out.println("Cultural: "+ nameOfculure);
        System.out.println("Fiels ="+fielsNumber);
    }


}
