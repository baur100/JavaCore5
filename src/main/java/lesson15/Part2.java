package lesson15;

public class Part2 {
    public static void main(String[] args) {
        Person person=new Person();
        person.hi();  //обязательно нужно создать обьект и потом вызывать динамическую функцию

        person.hello(); //чтобы вызвать статический метод вам не обязательно создавать обьект класса
                        // статические функции принадлежат классам а не обьектам

    }
}
