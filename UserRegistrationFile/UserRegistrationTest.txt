public class UserRegistrationTest {
    public static void main(String[] args) {

        UserRegistration registration = new UserRegistration();

        System.out.println("Registering users:");
        System.out.println("Alice registered: " + registration.registerUser("Alice"));
        System.out.println("Bob registered: " + registration.registerUser("Bob"));
        System.out.println("Charlie registered: " + registration.registerUser("Charlie"));
  
        System.out.println("Alice registered again: " + registration.registerUser("Alice"));

        System.out.println("\nUsers in the system:");
        registration.displayUsers();

        System.out.println("\nRemoving users:");
        System.out.println("Bob removed: " + registration.removeUser("Bob"));

        System.out.println("\nUsers in the system after removal:");
        registration.displayUsers();
    }
}
