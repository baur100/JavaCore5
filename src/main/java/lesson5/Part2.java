package lesson5; // фенкции с аргументами

public class Part2 {
    public static void main(String[] args) {    // У функции  есть: имя, параметры, аргуементы
        HelloToYou("Alena");              // Каждую функцию мы декларируем 1 раз, а вызывать множество раз
        HelloToYou("Alina");
        HelloToYou("Anna");

    trip("New York","Moscow");
    trip("Sydney", "Los Angeles");
    }
    public static void HelloToYou(String name){
        System.out.println("Hello!"+name);

    }
    public static void trip(String city1, String city2){
        System.out.println("Trip from " + city1+ " just landed at "+ city2+ ".");
    }
}
