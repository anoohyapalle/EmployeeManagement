import java.util.Hashtable;

public class ContactManagement {
    private Hashtable<Integer, Contact> contacts = new Hashtable<>();

    public void addContact(Contact contact) {
        contacts.put(contact.getId(), contact);
    }

    public void removeContact(int contactId) {
        contacts.remove(contactId);
    }

    public void displayContacts() {
        System.out.println("Contacts:");
        for (Contact contact : contacts.values()) {
            System.out.println(contact);
        }
    }
}
