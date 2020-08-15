package lesson6;

public class App {
    public static void main(String[] args) {
//Функции без аргументов и которые ничего не возвращают

//Вызов функции-вызывать можем сколько угодно
        hello();   //каждый раз когда вызываем метод hello, выполняется то что есть в этом методе
        hello();  //функции без параметров
        hello();

        hi();
        hi();
        hi();
        hi();

        hello();
    }
//Декларация функции-декларируем всего 1 раз
    public static void hello(){
        System.out.println("Hello, my friend");
        System.out.println("Today is a beautiful weather");
    }

    public static void hi(){
        hello();
        System.out.println("Hi - Hi - Hi");
    }
}