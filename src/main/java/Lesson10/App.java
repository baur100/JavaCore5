package Lesson10;

public class App {
//    Сделать 3 класса - в каждом классе по краней мере 3 атрибута.
//    Каждый аттрибут имеет setter и getter
//    Каждый класс имеет по краней мере 2 конструктора - default и полный (можно больше конструкторов)
//    создайте в каждом классе метод printClass() - для вывода всех полей на экран
//
//    По крайней мере один атрибут в одном классе должен быть array
//    Создайте в классе Work / main() по крайней мере 2 объекта каждого класса - один полным конструктором, один дефолтовым. Объект созданный дефолтовым конструктором заполните при помощи сеттеров
//    Выведите на экран эти объекты функцией printClass()

    public static void main(String[] args){
        System.out.println("--------");
        System.out.println("Class 1");
        System.out.println("--------");

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        Store t_Mobile = new Store("T-Mobile ", "13179 Black Mountain Rd", " San Diego", " CA ", 92129, Type.PHONE_SERVICE);
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");


        System.out.println("--------");
        System.out.println("Class 2");
        System.out.println("--------");

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        Store2 walmart = new Store2("Walmart", " 8225 Mira Mesa Blvd ", "San Diego", " CA ", 92126, Type.SUPERMARKET);
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        System.out.println(walmart.getName());
        walmart.setName("Sprouts");
        System.out.println(walmart.getName());

        System.out.println(t_Mobile.getName());
        t_Mobile.setName("AT&T");
        System.out.println(t_Mobile.getName());


        Groceries shopping = new Groceries();
        shopping.setIceCream("Popcorn");
        shopping.setCereal("CocoPuffs");
        shopping.setMilk("Lactose Free milk");
        shopping.setBread("French bread");
        shopping.setButter("Salted butter");
        shopping.printGroceries();
        
    }
}

