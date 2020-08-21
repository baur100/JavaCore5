package hw11;
//Сделать Enum (или 2 enum)
//Сделать 2 класса - в первом классе атрибут сделать типа Enum
//Во  втором классе - атрибут типа Enum[]

public class App {
    public static void main(String[] args) {
        Stores[] store = {Stores.Target};
        Shopping usr = new Shopping(Brands.Gucci, store, "Kevin", 25000);
        usr.printShopping();


        Brands[] brand = {Brands.Chanel, Brands.Dior, Brands.LouisVuitton, Brands.Versace};
        Stores[] store2 = {Stores.Target, Stores.BestBuy, Stores.HomeDepot, Stores.Macys, Stores.Walmart, Stores.Marshall};
        Dressing dressUp= new Dressing(brand, store2, "Bag", 199);

        dressUp.printDressing();


    }
}
