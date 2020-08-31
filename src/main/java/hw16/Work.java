package hw16;

public class Work {
    public static void main(String[] args) {
        System.out.println("====WOLF====");
        Wolf w=new Wolf("Wolfs","Grey",11566);
        System.out.println(w);
        w.mammals();
        w.vertebrates();
        w.animals();

        System.out.println("====WHALE====");
        BlueWhale bw=new BlueWhale("WhaleS","Blue", 4562);
        System.out.println(bw);
        bw.animals();
        bw.vertebrates();
        bw.mammals();

        System.out.println("====LION====");
        Lion l=new Lion("Lions","African",18903);
        System.out.println(l);
        l.animals();
        l.vertebrates();
        l.mammals();
    }
}
