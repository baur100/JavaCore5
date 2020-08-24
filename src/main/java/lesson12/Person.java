package lesson12;

import lesson11.Address;
   // АБСТРАКЦИЯ
public abstract class Person { // Абстрактный класс
    protected String name;    //Мы не сможем создать обьект этого класса, это не имеет смысла
    protected String lastname;  // В абсрактоном классе могут быть абстрактные функции
    protected Address address; // Если класс имеет хоть одну абстрактную функцию, то класс автоматически становиться абстрактным
    protected int yearOfBirth;

    public Person(String name, String lastname, Address address, int yearOfBirth) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }

        public abstract void personHello(); //Абстрактные функции не имеют тела


}
