public class InventoryManagementTest {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        inventory.addProduct(new Product(1, "Stationery", 10));
        inventory.addProduct(new Product(2, "Grocery", 20));
        inventory.addProduct(new Product(3, "Furniture", 15));
        inventory.addProduct(new Product(4, "Games", 25));


        System.out.println("Products after adding:");
        inventory.displayProducts();

        System.out.println("\nUpdating quantity of product ID 2:");
        inventory.updateProductQuantity(2, 30);
        inventory.displayProducts();

        System.out.println("\nRemoving product ID 1:");
        inventory.removeProduct(1);
        inventory.displayProducts();
    }
}
