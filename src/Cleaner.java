import java.util.ArrayList;

public class Cleaner extends Employee implements CanClean{

    public Cleaner(String name, int id, String email, int age, Gender gender, int salary) {
        super(name, id, email, age, gender, salary);
        this.login = null;
        this.password = null;
        this.messages = new ArrayList<>();
        this.registered = false;
        this.authorized = false;
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the room. ");
    }

}
