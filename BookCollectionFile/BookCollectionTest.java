public class BookCollectionTest {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        System.out.println("Adding books:");
        System.out.println("Add 'The Great Gatsby': " + collection.addBook("The Great Gatsby"));
        System.out.println("Add '1984': " + collection.addBook("1984"));
        System.out.println("Add 'To Kill a Mockingbird': " + collection.addBook("To Kill a Mockingbird"));
        System.out.println("Add '1984' again: " + collection.addBook("1984"));

        System.out.println("\nBooks in the collection:");
        collection.displayBooks();

        System.out.println("\nRemoving books:");
        System.out.println("Remove '1984': " + collection.removeBook("1984"));

        System.out.println("\nBooks in the collection after removal:");
        collection.displayBooks();
    }
}
