import java.util.ArrayList;
import java.util.List;
public class Teacher extends Employee implements CanDoResearch{
    TeacherType t;
    private List<String> messages;
    public Teacher(String name, int id, String email, int age, Gender gender, TeacherType t, int salary) {
        super(name, id, email, age, gender, salary);
        this.t = t;
        this.messages = new ArrayList<>();
        this.registered = false;
        this.authorized = false;
    }

    String getInfoAboutCourse(Course course){
        return course.toString();
    }
    private String getInfoAboutStudent(Student student){
        return student.toString();
    }
    public void becomeAnAuthor(ResearchPaper researchPaper) {
        researchPaper.addAuthor(this);
    }
    public void addReference(ResearchPaper researchPaper, String reference) {
        researchPaper.addReference(reference);
    }
    public void addFigure(ResearchPaper researchPaper, String figure) {
        researchPaper.addFigure(figure);
    }
}
