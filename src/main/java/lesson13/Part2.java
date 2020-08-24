package lesson13;

import java.util.ArrayList;
import java.util.List;

// COLLECTION - своеобразныый враппер для арреев
public class Part2 {
    public static void main(String[] args) {


        //Первый тип коллекций ArrayList<>
        ArrayList<String> list = new ArrayList<String>(); // Аррей лист очень динамичный в отличии от аррев
        // размер аррей листа может меняться по ходу действий
        list.add("Hello");         // Функция add всегда добавляет значение к уже существующим в аррее
        //  System.out.println(list);
        list.add("Fish");
        //   System.out.println(list);
        list.add("Milk");
        list.add("Cherry");
        //  System.out.println(list);
        list.add(1, "Flower");  //таккже можно добавить ко всем существующим значениям дополнительное
        //  System.out.println(list);            // на определееное место, используя индекс
        //  System.out.println(list.get(3));     // функция .get вытаскивает для печати определенный элемент под определенным индексом
        list.set(0, "Cheese");                     // функцияя .set изменяет значения по определенному индексу
        //  System.out.println(list);
        //  System.out.println(list.size());
        Boolean gotmilk = list.contains("Milk");   // метод по поиску значений
        //  System.out.println(gotmilk);        // результат true - значение найдено, существует / false - нет такого
        // Удаление
        list.remove("Cherry");  // удаление по объекту
        //  System.out.println(list);
        list.remove(1);
        //   System.out.println(list); // удаление по индексу
        boolean v = list.remove("Fish"); // если такой элемент найден то вернется true  и элемент удалиться, а если нет то false

        ArrayList<Integer> numbers = new ArrayList<Integer>(); //Коллекции работают всегда только с классами, примитивы не берут
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        //  System.out.println(numbers);
        // System.out.println(numbers.size());

        for (Integer w : numbers) {      // Печатает все 5 в аррее
            if (w == 5) {
                //   System.out.println(w);
            }
        }  // Анонимные функции ARROW function jочень часто употребляются с коллекциями
        //  numbers.forEach(x->System.out.println(x));   // Распечатываю все элементы в аррее. Оператор ЛЯМДА
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Pink");
        System.out.println(colors);
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        // Предвочтительные способы распечатки арреев ниже
        for (String color : colors) {
            System.out.println(color);
        }
        colors.forEach(x -> System.out.println(x));

       Person anna= new Person("Anna","Fomina",1994);
       Person jay=new Person("Jay","Simpson",1985);
        List<Person> people=new ArrayList<Person>();
        people.add(anna);
        people.add(jay);
        people.add(new Person("Ivan","Holoki",1990));
        System.out.println(people.size());
        System.out.println(people.get(2).getFullname());
        System.out.println(people);      // чтобы распечатывать арри из объектов необходимо в классе объекта добавить функцию toString

        List<Colors> colors1=new ArrayList<Colors>();
        colors1.add(Colors.GREEN);
        colors1.add(Colors.GREEN);
        colors1.add(Colors.PINK);
        System.out.println(colors1);


    }
}
