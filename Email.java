public class Email {
    private String sender;
    private String recipient;
    private String subject;
    private String body;
    private String timestamp;
    private String folder; // Inbox, Sent, Drafts, Trash

    public Email(String sender, String recipient, String subject, String body, String timestamp) {
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
        this.timestamp = timestamp;
        this.folder = "Sent";
    }

    // Methods to display email details and manage email status
}
