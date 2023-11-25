
public class Student extends User {
    private String university;
    private int year;

    public Student(String name, int id, String email, int age, Gender gender, String university, int year) {
        super(name, id, email, age, gender);
        this.university = university;
        this.year = year;
    }
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", id=" + getID() +
                ", email='" + getEmail() + '\'' +
                ", age=" + getAge() +
                ", university='" + university + '\'' +
                ", year=" + year +
                '}';
    }

}

