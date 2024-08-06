import java.util.TreeSet;

public class UserRegistration {
    private TreeSet<String> users = new TreeSet<>();

    public boolean registerUser(String userName) {
        return users.add(userName);
    }

    public boolean removeUser(String userName) {
        return users.remove(userName);
    }

    public void displayUsers() {
        System.out.println("Registered Users:");
        for (String user : users) {
            System.out.println(user);
        }
    }
}
