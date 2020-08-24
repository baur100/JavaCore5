package lesson12;

public class Part1 {
    public static void main(String[] args) {
       // DesctopLight ge11 = new DesctopLight("GE", "11", 30);
        // ge11.bulbStandart();
     //   ge11.contacts2();
       // ge11.switchOn();

      //  Vacuum lg14 = new Vacuum("LG", "14", 2000, 400);
      //  lg14.contacts2();

// Интерфес может создать обьект класса который он использует
        AmericanPowerSocket dl = new DesctopLight("Phillips", "B2", 25);
        AmericanPowerSocket va = new Vacuum("LG", "E34", 2000, 580);

// Объекту родительского класа мы можем давать значения детских обьектовб НО НЕ НАОБОРОТ
        AmericanPowerSocket[] devices = {dl, va}; //можем создавать арреи из обьектов которые имплементируют этот интерфейс

        //1 способ печати
        devices[0].contacts2();
        devices[1].contacts2();

        // 2 способ печати
        for (AmericanPowerSocket v: devices){
            v.contacts2(); // Полиморфизм - когда одна функция содержит разные рузультаты разных обектов
        }                      // т.е. функция была абстрактной, но когда мы создаем обьекты с этой функцией
                               // то мы можем присвоить разные выводы, результаты функции
    }                          // поэтому при воспроизведении одной функции в аррее через for each или по отдельности
                               // одна функция выводит разные результаты проходя через разные обьекты в аррее

}
