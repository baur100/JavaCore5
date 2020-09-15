package lesson14;

public class Tickets {
    private int price;

    public Tickets(int price) {
        this.price = price;
    }

    public Double getPrice(int age){
        if(age<2){
            return 0.0;
        }
        if(age<12){
            return this.price*0.5;
        }
        if(age>65){
            return this.price*0.8;
        }
        return this.price*1.0;
    }
}
