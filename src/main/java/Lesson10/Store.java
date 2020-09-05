package Lesson10;

public class Store {
    public String name;
    public String address;
    public String city;
    public String state;
    public int zip;
    public Type type;

    public Store(String n, String a, String c, String st, int z, Type t) {
        name = n;
        address = a;
        state = st;
        city = c;
        zip = z;
        type = t;
        System.out.println(" The store name is " + n + " and the address is" + " -- " + a + "," + c + "," + st + z + "-" + t);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public Type getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setzip(int zip) {
        this.zip = zip;
    }


    public void printInfo() {
        System.out.println("Store{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", type2=" + type +
                '}');
    }
}
