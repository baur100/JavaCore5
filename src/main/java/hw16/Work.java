package hw16;

public class Work {
    public static void main(String[] args) {
        System.out.println("====WOLF====");
        Wolf w=new Wolf("Wolfs","Grey",11566);
        System.out.println(w);
        w.breathe();
        w.multiply();
        w.eat();
        w.die();
        w.mammals();
        w.vertebrates();
        w.animals();

        System.out.println("====WHALE====");
        BlueWhale bw=new BlueWhale("WhaleS","Blue", 4562);
        System.out.println(bw);
        bw.breathe();
        bw.multiply();
        bw.eat();
        bw.die();
        bw.animals();
        bw.vertebrates();
        bw.mammals();

        System.out.println("====LION====");
        Lion l=new Lion("Lions","African",18903);
        System.out.println(l);
        l.breathe();
        l.multiply();
        l.eat();
        l.die();
        l.animals();
        l.vertebrates();
        l.mammals();
    }
}
