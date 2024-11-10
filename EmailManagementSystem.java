import java.util.Scanner;

public class EmailManagementSystem {
    private ArrayList<User> users;
    private ArrayList<Folder> folders;

    public EmailManagementSystem() {
        users = new ArrayList<>();
        folders = new ArrayList<>();
    }

    public void login(String username, String password) {
        // Login logic: authenticate user and grant access
    }

    public void composeEmail() {
        // Logic for composing a new email
    }

    public void viewInbox() {
        // Display emails in the Inbox folder
    }

    public static void main(String[] args) {
        EmailManagementSystem ems = new EmailManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Main menu and logic to interact with EMS functions
    }
}
