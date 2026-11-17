package Lab9;


public class LibraryDriver {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[2];

        items[0] = new Book("Book", "B101", "J.R.R. Tolkien", "The Hobbit", 310);
        items[1] = new CD("CD", "C202", "Coldplay", "Parachutes", 10);

        for (LibraryItem item : items) {
            System.out.println(item.toString());

            if (item instanceof LoanItem) {
                LoanItem loanable = (LoanItem) item;
                System.out.printf("Loan Price: €%.2f%n%n", loanable.calculatePrice());
            }
        }
    }
}
