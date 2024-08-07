public class CustomerAccountsTest {
    public static void main(String[] args) {
        CustomerAccounts accounts = new CustomerAccounts();

        accounts.addCustomer(new Customer(1, "Anoohya", "anoohya@gmail.com"));
        accounts.addCustomer(new Customer(2, "Devika", "devika@gmail.com"));
        accounts.addCustomer(new Customer(3, "Praisee", "prasiee@gmail.com"));

        System.out.println("Customers after adding:");
        accounts.displayCustomers();

        System.out.println("\nRemoving customer ID 2:");
        accounts.removeCustomer(2);
        accounts.displayCustomers();
    }
}
