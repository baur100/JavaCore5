package hw10;

public class App1 {
    public static void main(String[] args) {
        Aptitudes[] aptitudes = {Aptitudes.JUMP, Aptitudes.FLY, Aptitudes.RUN};

        Mammalian squirrel = new Mammalian("Squirrel", "Not dangerous", aptitudes);

        squirrel.printInfo();
        System.out.println(squirrel.getType());
        System.out.println("******************");

        Aves eagle = new Aves("Eagle", "Dangerous", 40);
        Arachnids spider = new Arachnids("Spider", "Dangerous", 9);

        System.out.println(eagle.getHazardClass());
        eagle.printInfo();
        spider.printInfo();

        Mammalian mammalian = new Mammalian();
        Aptitudes[] aptitudes1 = {Aptitudes.JUMP, Aptitudes.RUN};

        mammalian.setAptitudes(aptitudes1);
        mammalian.setHazardClass("Dangerous");
        mammalian.setType("Type");
        mammalian.printInfo();


    }

}