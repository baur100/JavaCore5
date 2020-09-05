package Lesson10;

public class Store2 {
    private String name;
    private String address;
    private String city;
    private String state;
    private int zip;
    private Type type2;

    public Store2(String n2, String a2, String c2, String st2, int z2, Type t2) {
        name = n2;
        address = a2;
        city = c2;
        state = st2;
        zip = z2;
        type2 = t2;
        System.out.println(" The second store name is " + n2 +" and the address is"+ " -- "+ a2 + "," + c2 + "," + st2 + z2 + "-"+ t2);
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public int getZip(){
        return zip;
    }
    public Type getType(){
        return type2;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setCity(String city ){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setZip(int zip){
        this.zip = zip;
    }
    public void setType2(Type type2) { this.type2 = type2; }


    public void printInfo() {
        System.out.println( "Store2{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", type2=" + type2 +
                '}');

    }
}
