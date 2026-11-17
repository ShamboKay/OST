package Lab9;


public class Book extends LibraryItem implements LoanItem {
    private String author;
    private String title;
    private int numPages;

    public Book(String type, String ID, String author, String title, int numPages) {
        super(type, ID);
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

    @Override
    public double calculatePrice() {
        return numPages * 0.05;
    }

    @Override
    public String toString() {
        return super.toString() + ", Title: " + title + ", Author: " + author + ", Pages: " + numPages;
    }
}
