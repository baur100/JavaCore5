package hw10;

public class Movies {
    private String name;
    private int year;
    private int budget;
    private Genre genre;
    private Genre[] genres;


    public Movies(){

    }
    public Movies(String name, int year, int budget, Genre genre){
        this.name = name;
        this.year = year;
        this.budget = budget;
        this.genre = genre;

    }
    public String getName(){return name;}
    public int getYear(){return year;}
    public int getBudget(){return budget;}
    public Genre getGenre(){return genre;}

    public Genre[] getGenres() {
        return genres;
    }

    public void setName(String name){this.name = name;}
    public void setYear(int year){this.year = year;}
    public void setBudget(int budget){this.budget = budget;}
//    public void setGenre(Genre[] genre){this.Genre = genre;}
    public void setGenres(Genre[] genres){this.genres = genres;}

    public void PrintMoviesInfo(Class<? extends Movies> aClass){
        System.out.println(name+" is released in "+year+" and had "+budget+" million budget, genre: "+genre);
        for (Genre m: this.genres);


    }
}
