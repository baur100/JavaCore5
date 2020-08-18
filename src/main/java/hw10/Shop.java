package hw10;

public class Shop {
    private String nameshop;
    private String spec;
    private int position;
    private Days[] workdays;
    private Brand[] brandphones;

    //DEFAULT CONSTRUCTION
    public Shop() {
    }

    //CONSTRUCTION
    public Shop(String nameshop1, String spec1, int position1, Days[] workdays1, Brand[] brandphones1) {
        nameshop = nameshop1;
        spec = spec1;
        position = position1;
        workdays = workdays1;
        brandphones = brandphones1;
    }

    public Shop(String nameshop2, int position2, Days[] workdays2, Brand[] brandphones2) {
        nameshop = nameshop2;
        position = position2;
        workdays = workdays2;
        brandphones = brandphones2;
    }

    public Shop(String nameshop3, Days[] workdays3, Brand[] brandphones3) {
        nameshop = nameshop3;
        workdays = workdays3;
        brandphones = brandphones3;
    }

    public Shop(String nameshop4, Brand[] brandphones4) {
        nameshop = nameshop4;
        brandphones = brandphones4;
    }

    public Shop(String nameshop5, int position5, Days[] workdays5) {
        nameshop = nameshop5;
        position = position5;
        workdays = workdays5;
    }

    public Shop(String nameshop6, Days[] workdays6) {
        nameshop = nameshop6;
        workdays = workdays6;
    }

    //SETTERS and GETTERS
    public String getNameshop() {
        return nameshop;
    }

    public void setNameshop(String NewNameshop) {
        this.nameshop = NewNameshop;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String NewSpec) {
        this.spec = NewSpec;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int NewPosition) {
        this.position = NewPosition;
    }

    public Days[] getWorkdays() {
        return workdays;
    }

    public void setWorkdays(Days[] NewWorkdays) {
        this.workdays = NewWorkdays;
    }

    public Brand[] getBrand() {
        return brandphones;
    }

    public void setBrand(Brand[] newBrandphones) {
        this.brandphones = newBrandphones;
    }

    //PRINT ALL ATTRIBUTES
    public void printClass() {
        System.out.println("===========" + nameshop + "SHOP INFORMATION===========");
        System.out.println(nameshop + " Schedule: " + workdays);
        System.out.println("Specialization of shop: " + spec + ". Current amount of other position: " + position);
        System.out.println("Special for you, we have popular BRANDS:" + brandphones);
    }

}
