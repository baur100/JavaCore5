package hw10;

public class Book {
    private String name;
    private int numberOfPages;
    private String bookDepartment;
    private String hardBookCover;
    private Colors colors;

    public Book(String Name, String BookDepartment, int numberOfPages, Colors color){
        this.name = Name;
        this.bookDepartment = BookDepartment;
        this.numberOfPages = numberOfPages;
        this.colors = color;
    }
    public Book(){}

    public void setName(String Name){
        this.name = Name;
    }
    public String getName(){
        return name;
    }
    public void setNumberOfPages(int Number){
        this.numberOfPages = Number;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
    public void setHardBookCover(String hardBookCover){
        this.hardBookCover = hardBookCover;
    }
    public String getHardBookCover(){
        return hardBookCover;
    }
    public void setBookDepartment(String department){
        this.bookDepartment = department;
    }
    public void setColors(Colors color){
        this.colors=color;
    }
    public Colors getColors(){
        return colors;
    }

    public void printBook(){
        System.out.println("I just finished reading book: " + name + ", this book having " + numberOfPages +
                " pages. I have found this book in: "+ bookDepartment + " selection and the Covering of the book is in "
                + colors + " color and " + hardBookCover + " cover");
    }
}
