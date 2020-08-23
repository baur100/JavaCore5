package hw13;

public class House {
    private String city;
    private int price;

    public House(String city,int price) {
        this.city = city;
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House" +
                "\ncity ='" + city + '\'' +
                "\nprice = " + price +
                "\n***************************************";
    }
}
