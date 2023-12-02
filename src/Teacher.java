import java.util.ArrayList;
import java.util.List;
public class Teacher extends Employee implements CanDoResearch{
    TeacherType teacherType;
    private List<String> messages;
    public Teacher(String name, int id, String email, int age, Gender gender, TeacherType teacherType, int salary) {
        super(name, id, email, age, gender, salary);
        this.teacherType = teacherType;
        this.login = null;
        this.password = null;
        this.messages = new ArrayList<>();
        this.registered = false;
        this.authorized = false;
    }
    public void addComplaintToDean(String complaint, ComplaintImportance importance, Dean dean) {
        dean.addComplaint(complaint, importance);
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
    public void addAnAuthor(User user, ResearchPaper researchPaper) {
        researchPaper.addAuthor(user);
    }
    public void addReference(ResearchPaper researchPaper, String reference) {
        researchPaper.addReference(reference);
    }
    public void addFigure(ResearchPaper researchPaper, String figure) {
        researchPaper.addFigure(figure);
    }
}
