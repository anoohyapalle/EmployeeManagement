public class ContactManagementTest {
    public static void main(String[] args) {

        ContactManagement management = new ContactManagement();

        management.addContact(new Contact(1, "Anoohya", "6985422290"));
        management.addContact(new Contact(2, "Devika", "9568742501"));
        management.addContact(new Contact(3, "Praise", "7589684112"));

        System.out.println("Contacts after adding:");
        management.displayContacts();

        System.out.println("\nRemoving contact ID 2:");
        management.removeContact(2);
        management.displayContacts();
    }
}
