
public class Student extends User{
    private String university;
    private int year;
    public Student(String name, int id, String email, int age, Gender gender, String university, int year) {
        super(name, id, email, age, gender);
        this.university = university;
        this.year = year;
        this.login = null;
        this.password = null;
        this.registered = false;
        this.authorized = false;
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
    public void becomeAnAuthor(ResearchPaper researchPaper) {
        researchPaper.addAuthor(this);
    }
    public void addReference(Teacher teacher, ResearchPaper researchPaper, String reference) {
        teacher.addReference(researchPaper, reference);
    }
    public void addFigure(Teacher teacher, ResearchPaper researchPaper, String figure) {
        teacher.addFigure(researchPaper, figure);
    }
}

