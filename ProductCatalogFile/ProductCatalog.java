import java.util.HashSet;

public class ProductCatalog {
    private HashSet<String> products = new HashSet<>();

    public boolean addProduct(String productName) {
        // Add the product and return whether the addition was successful (i.e., the product was not already present)
        return products.add(productName);
    }

    public boolean removeProduct(String productName) {
        // Remove the product and return whether the removal was successful
        return products.remove(productName);
    }

    public boolean searchProduct(String productName) {
        // Check if the product exists in the catalog
        return products.contains(productName);
    }

    public void displayProducts() {
        System.out.println("Product Catalog:");
        for (String product : products) {
            System.out.println(product);
        }
    }
}
