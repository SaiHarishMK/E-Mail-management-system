import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<Email> emails;

    public Folder(String name) {
        this.name = name;
        this.emails = new ArrayList<>();
    }

    public void addEmail(Email email) {
        emails.add(email);
    }

    public void displayEmails() {
        for (Email email : emails) {
            System.out.println("Subject: " + email.getSubject() + " | From: " + email.getSender());
        }
    }
}
