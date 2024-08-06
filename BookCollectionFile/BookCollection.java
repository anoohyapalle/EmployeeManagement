import java.util.LinkedHashSet;

public class BookCollection {
    private LinkedHashSet<String> bookTitles = new LinkedHashSet<>();

    public boolean addBook(String bookTitle) {
        return bookTitles.add(bookTitle);
    }

    public boolean removeBook(String bookTitle) {
        return bookTitles.remove(bookTitle);
    }

    public void displayBooks() {
        System.out.println("Books Collection contains the following titles:");
        for (String bookTitle : bookTitles) {
            System.out.println(bookTitle);
        }
    }
}
