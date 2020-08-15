package homework8;

public class HomeWork {
    public static void main(String[] args) {
        FilmTypes Titanic = FilmTypes.DRAMA;
        FilmTypes Lord_of_the_rings = FilmTypes.FANTASY;
        FilmTypes Terminator = FilmTypes.ACTION;
        FilmTypes[] Popular = {Terminator, Titanic, Lord_of_the_rings};
        for (FilmTypes v: Popular)
        System.out.println(v);

        GameTypes FarCry = GameTypes.ACTION;
        GameTypes FIFA = GameTypes.SPORT;
        GameTypes NFS = GameTypes.SIMULATOR;
        GameTypes Diablo = GameTypes.RPG;
        GameTypes[] Best_Games_Genres = {GameTypes.ACTION, GameTypes.RPG, GameTypes.STRATEGY};
        for (GameTypes v: Best_Games_Genres)
            System.out.println(v);

    }

}
