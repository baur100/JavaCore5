package hw10;

public class Work {
    public static void main(String[] args) {
        //CLASS PHONE
        Phone phone1 = new Phone(Brand.APPLE, 10, 1299.99, 100, "USA.");
        phone1.printClass();

        Phone phone2 = new Phone();
        phone2.setBrand(Brand.MOTOROLLA);
        phone2.setSeria(777);
        phone2.setPrice(888.99);
        phone2.setAmount(50);
        phone2.setProvider("Japan");
        phone2.printClass();

        //CLASS SHOP

        Days[] workdays1 = {Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY};
        Brand[] brandphones1 = {Brand.APPLE, Brand.LG, Brand.SAMSUNG, Brand.XIAOMI};
        Shop shop1 = new Shop("Eldorado", "Electronics", 12, workdays1, brandphones1);
        shop1.printClass();


        Shop shop2 = new Shop();
        Days[] workdays2= {Days.FRIDAY,Days.SATURDAY,Days.SUNDAY};
        Brand[] brandphones2={Brand.APPLE,Brand.SAMSUNG};
        shop2.setNameshop("BestPRICE");
        shop2.setSpec("Home Goods");
        shop2.setPosition(15);
        shop2.setWorkdays(workdays2);
        shop2.setBrand(brandphones2);
        shop2.printClass();

        //CLASS BUYERS
        Days[] daypayment1={Days.SATURDAY};
        Brand[] brandph1={Brand.ONEPLUS,Brand.SAMSUNG};
        Buyers buyers1=new Buyers("Vladimir",2,2700.18,daypayment1,brandphones1);
        buyers1.printClass();

        Days[] daypayment2={Days.MONDAY,Days.TUESDAY};
        Brand[] brandph2={Brand.XIAOMI,Brand.SAMSUNG};
        Buyers buyers2=new Buyers();
        buyers2.setName("Nik");
        buyers2.setPurchase(brandph2);
        buyers2.setDayBuy(daypayment2);
        buyers2.setNumberP(2);
        buyers2.setPayment(3000.00);
        buyers2.printClass();
    }
}