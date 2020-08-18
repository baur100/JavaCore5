package hw10;

public class Book {
    private String Name;
    private int NumberOfPages;
    private String BookDepartment;
    private String HardBookCover;
    private Colors colors;

    public Book(String Name, String BookDepartment, int numberOfPages, Colors color){
        this.Name = Name;
        this.BookDepartment = BookDepartment;
        this.NumberOfPages = numberOfPages;
        this.colors = color;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void setNumberOfPages(int Number){
        this.NumberOfPages = Number;
    }
    public int getNumberOfPages(){
        return NumberOfPages;
    }
    public void setHardBookCover(String hardBookCover){
        this.HardBookCover = hardBookCover;
    }
    public String getHardBookCover(){
        return HardBookCover;
    }
    public void setBookDepartment(String department){
        this.BookDepartment = department;
    }
    public void setColors(Colors color){
        this.colors=color;
    }
    public Colors getColors(){
        return colors;
    }

    public void printBook(){
        System.out.println("I just finished reading book: " + Name + ", this book having " + NumberOfPages +
                " pages. I have found this book in: "+ BookDepartment + " selection and the Covering of the book is in "
                + colors + " color and " + HardBookCover + " cover");
    }
}
