package hw10;
// Сделать 3 класса - в каждом классе по краней мере 3 атрибута.
// Каждый аттрибут имеет setter и getter
// Каждый класс имеет по краней мере 2 конструктора - default и полный (можно больше конструкторов)
// создайте в каждом классе метод printClass() - для вывода всех полей на экран


// По крайней мере один атрибут в одном классе должен быть array
// Создайте в классе Work / main() по крайней мере 2 объекта каждого класса - один полным конструктором, один дефолтовым. Объект созданный дефолтовым конструктором заполните при помощи сеттеров
// Выведите на экран эти объекты функцией printClass()

public class Hw10 {
    public static void main(String[] args) {
//class 1
        System.out.println("+++++++++++START+++++++++++");
        Book book1 = new Book("World War 2", "History", 175, Colors.White);
        book1.printBook();

        book1.setName("Harry Potter 1");
        book1.setBookDepartment("Kids");
        book1.setHardBookCover("Hard");
        book1.setNumberOfPages(372);
        book1.setColors(Colors.Green);

        book1.printBook();
//class 2
        System.out.println("\n+++++++++++Another Class+++++++++++\n");
        FastFood mcdonald = new FastFood("McDonald", 5, "breakfast, lunch, dinner", Colors.Yellow);
        mcdonald.printFastFood();

        mcdonald.setColors(Colors.Red);
        mcdonald.setName("ChickenHouse");
        mcdonald.setDriveTime(20);
        mcdonald.setMenu("All day chicken");

        mcdonald.printFastFood();
//class 3
        System.out.println("\n+++++++++++Another Class+++++++++++\n");

        Pants jeans = new Pants(Size.L, "Levi's", "skinny jeans", 5);
        jeans.showPants();

        jeans.setBrand("Armani");
        jeans.setNumbersOfPockets(2);
        jeans.setType("High-Rise");
        jeans.setSize(Size.XXL);

        jeans.showPants();
    }
}
