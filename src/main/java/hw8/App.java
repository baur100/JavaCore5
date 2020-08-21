package hw8;
/* 1.Create 4 classes with fields, methods
   2. In the App class create main() and create 2 instanses of each class, fill all fields
      invoke methods*/

public class App {

    public static void main(String[] args) {

        Drinks drinks = new Drinks();
        drinks.water="Big win";
        drinks.coffee="Lavazza";
        drinks.juice="Ya";
        drinks.soda="Cola";
        drinks.tea="Lipton";
        drinks.myDrinks();

        Colors colors = new Colors();
        colors.black = "black";
        colors.blue = "blue";
        colors.green = "green";
        colors.red = "red";
        colors.yellow = "yellow";
        colors.printColors();

        Computers price = new Computers();
        price.razor = "2500";
        price.asus = "1500";
        price.mac = "3000";
        price.samsung = "2000";
        price.toshiba = "1500";
        price.myPC();

        Furniture fur = new Furniture();
        fur.bed = "Ikea";
        fur.sofa = "Walmart";
        fur.chair = "Home Depot";
        fur.desk = "Target";
        fur.door = "Ikea";
        fur.thisIsFurniture();

    }
}
