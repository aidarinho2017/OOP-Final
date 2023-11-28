import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class User implements Serializable {
    private final String name;
    private final int id;
    private String email;
    private int age;
    private final Gender gender;
    String login;
    String password;
    boolean registered;
    boolean authorized;
    List<String> messages;

    User(String name, int id, String email, int age, Gender gender) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.login = null;
        this.password = null;
        this.registered = false;
        this.authorized = false;
        this.messages = new ArrayList();
    }

    void register(String login, String password) {
        if (this.registered) {
            System.out.println("This user is already registered");
        } else {
            this.registered = true;
            this.login = login;
            this.password = password;
        }

    }

    void changePassword(String newPassword) {
        if (this.authorized) {
            this.password = newPassword;
        } else {
            System.out.println("You're not authorized");
        }

    }

    void changeLogin(String newLogin) {
        if (this.authorized) {
            this.login = newLogin;
        } else {
            System.out.println("You're not authorized");
        }

    }

    void logIn(String login, String password) {
        if (login.equals(this.login) && password.equals(this.password)) {
            this.authorized = true;
        }

    }

    void birthday() {
        ++this.age;
    }

    public String toString() {
        String var10000 = this.name;
        return "name='" + var10000 + "', id=" + this.id + ", email='" + this.email + "', age=" + this.age + ", gender=" + String.valueOf(this.gender);
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void getMessage(String message) {
        this.messages.add(message);
    }

    public List<String> getMessages() {
        if (!this.authorized) {
            System.out.println("You are not authorized");
            return null;
        } else {
            return new ArrayList<>(this.messages);
        }
    }

    public void sendMessage(User recipient, String message) {
        if (!this.authorized) {
            System.out.println("You're not authorized to send messages.");
        } else if (!this.registered) {
            System.out.println("The recipient is not registered.");
        } else {
            recipient.getMessage(this.getName() + ": " + message);
            System.out.println("Message sent to " + recipient.getName());
        }
    }
}