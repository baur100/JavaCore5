package hw10;

public class Market {
    private String name;
    private String adress;
    private String country;
    private int count;


    public Market(String name, String adress, String country, int count){
        this.name = name;
        this.adress = adress;
        this.country = country;
        this.count = count;
    }
    public Market(){}

    public String getName(){return name;}
    public String getAdress(){return adress;}
    public String getCountry(){return country;}
    public int getCount(){return count;}

    public void setName(String name){this.name = name;}
    public void setAdress(String adress){this.adress = adress;}
    public void setCountry(String country){this.country = country;}
    public void setCount(int count){this.count = count;}
    public void PrintMarketInfo(){
        System.out.println(" Brand "+name+" is from "+country+" have "+count+" locations. Main adress is "+adress);

    }







}
