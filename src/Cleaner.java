public class Cleaner extends Employee implements CanClean{

    public Cleaner(String name, int id, String email, int age, Gender gender, int salary) {
        super(name, id, email, age, gender, salary);
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the room. ");
    }
}
