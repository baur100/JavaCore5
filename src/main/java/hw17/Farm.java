package hw17;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle,Integer> cattle;
    private ArrayList<AgreeCultural> agreeCultural;

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattle, ArrayList<AgreeCultural> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
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

    public HashMap<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(HashMap<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public ArrayList<AgreeCultural> getAgreeCultural() {
        return agreeCultural;
    }

    public void setAgreeCultural(ArrayList<AgreeCultural> agreeCultural) {
        this.agreeCultural = agreeCultural;
    }


    public void printCattle() {
        System.out.println("\n Cattle: ");
        for (HashMap.Entry<Cattle, Integer> x : cattle.entrySet()) {
            System.out.println("Type: " + x.getKey() + ". Amount:" + x.getValue());
        }
    }

        public void printAgreeCultural() {
            System.out.println("\n AgreeCultural: ");
            for(AgreeCultural x: agreeCultural){
                System.out.println(x.toString());
            }
        }

    public void printInfo(){
        System.out.println("Farm <" + name + ">"+
                "\n"+ address);
                printCattle();
                printAgreeCultural();

    }

    }

