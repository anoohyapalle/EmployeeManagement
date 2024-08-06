public class ProductCatalogTest {
    public static void main(String[] args) {

        ProductCatalog catalog = new ProductCatalog();

        System.out.println("Adding products:");
        System.out.println("Laptop added: " + catalog.addProduct("Laptop"));
        System.out.println("Smartphone added: " + catalog.addProduct("Smartphone"));
        System.out.println("Tablet added: " + catalog.addProduct("Tablet"));

        System.out.println("Laptop added again: " + catalog.addProduct("Laptop"));

  
        System.out.println("\nCatalog contents:");
        catalog.displayProducts();

        System.out.println("\nSearching for products:");
        System.out.println("Smartphone exists: " + catalog.searchProduct("Smartphone"));
        System.out.println("Camera exists: " + catalog.searchProduct("Camera"));

        System.out.println("\nRemoving products:");
        System.out.println("Tablet removed: " + catalog.removeProduct("Tablet"));
        System.out.println("Camera removed: " + catalog.removeProduct("Camera"));

        System.out.println("\nCatalog contents after removal:");
        catalog.displayProducts();
    }
}
