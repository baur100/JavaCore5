package lesson9;

public class Part3 {
    public static void main(String[] args) {
        House obj287=new House();
        obj287.address="123 Pumpkin St, Hollywood, FL";
        obj287.sq=2000;
        obj287.bd=3;
        obj287.bathr=2;
        obj287.price=225000;
        obj287.year=2009;
        obj287.printHouseInfo("obj287");

        House obj322=new House();
        obj322.address="400 Jackson St, Hollywood, FL";
        obj322.sq=3200;
        obj322.bd=2;
        obj322.bathr=2;
        obj322.price=190000;
        obj322.year=2005;
        obj322.printHouseInfo("obj322");
    }
}
