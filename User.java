public class User {
    private String userId;
    private String username;
    private String password;

    // Constructor, getters, and setters
    public User(String userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }
}
