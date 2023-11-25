import java.util.ArrayList;
import java.util.List;
public abstract class Employee extends User {
    private int salary;
    private List<String> messages;
    public Employee(String name, int id, String email, int age, Gender gender, int salary) {
        super(name, id, email, age, gender);
        this.salary = salary;
        this.messages = new ArrayList<>();
        this.registered = false;
        this.authorized = false;
    }
    private int getSalary() {
        return this.salary;
    }
}