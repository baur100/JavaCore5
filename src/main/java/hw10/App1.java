package hw10;

public class App1 {
    public static void main(String[] args) {
        Mammalian squirrel = new Mammalian("Squirrel", "Not dangerous", Aptitudes.JUMP);
        Aves eagle = new Aves("Eagle", "Dangerous", 40);
        Arachnids spider = new Arachnids("Spider", "Dangerous", 9);

        Aptitudes [] aptitudes = {Aptitudes.JUMP, Aptitudes.FLY, Aptitudes.RUN};
        squirrel.printInfo();

        System.out.println(eagle.getHazardClass());
        eagle.printInfo();

        System.out.println(squirrel.getType());
        squirrel.printInfo();

        spider.printInfo();






    }

}
