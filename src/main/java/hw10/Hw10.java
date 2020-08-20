package hw10;

public class Hw10 {
    public static void main(String[] args) {
        Market Walmart = new Market("Walmart", "Dobie st. WA", "USA", 10000);
        Market HEB = new Market("HEB","Hills Dr.","USA",20000);

        Walmart.PrintMarketInfo();
        Walmart.setAdress("Dobie st. WA");
        Walmart.setCount(10000);
        Walmart.setCountry("USA");
        Walmart.setName("Wallgreens");
        Walmart.PrintMarketInfo();
        System.out.println("-----------------------------------------------------------------------------");
        HEB.PrintMarketInfo();
        System.out.println(HEB.getCount());
        System.out.println("==============================================================================");

        Phones Apple = new Phones("Apple","iPhone 11",2019,Colors.BLACK);

        Phones Samsung = new Phones();

        Apple.PrintPhoneInfo();
        System.out.println("Samsung");
        Samsung.setBrand("Samsung");
        Colors[] col = {Colors.BLACK,Colors.BLUE,Colors.PINK,Colors.WHITE};
        Samsung.setColors(col);
        Samsung.printColors(col);
        System.out.println("===============================================================");

        Movies Titanic = new Movies("Titanic",1997,200,Genre.DRAMA);
        Genre[] genr = {Genre.ACTION,Genre.DRAMA,Genre.ROMANCE};
  //      Titanic.setGenre(genr);
  //      Titanic.PrintMoviesInfo();




















    }
}
