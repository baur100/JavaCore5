package hw15;

public class FictionBook implements Hardbook {
    private String bookName;
    private String author;
    private int price;

    public FictionBook(String bookName, String author, int price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public void soldOut(String bookName){
        System.out.println("This fiction book " + bookName + " is currently unavailable. its sold out");
    }

    public void hardCover() {
        System.out.println("This fiction book " + bookName + "has Hard Cover");

    }



    public String aboutFiction (String bookName) {
        return "FictionBook{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public void printOnParer() {
        System.out.println("This fiction book " + bookName + " available only in printed option");

    }
}

