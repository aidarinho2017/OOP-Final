import java.util.Map;
import java.util.HashMap;
public class Student extends User{
//    private String university;
//    private int creditsLimit;
    private Faculty faculty;
    private int year;
    private String speciality;
    private boolean scholarship;
    private Map<Course, Double> grades;

    public Student(String name, int id, String email, int age, Gender gender,Faculty faculty, int year,boolean scholarship,String speciality) {
        super(name, id, email, age, gender);
        this.year = year;
        this.login = null;
        this.scholarship= scholarship;
        this.speciality =speciality;
        this.faculty =faculty;
        this.password = null;
        this.registered = false;
        this.authorized = false;
        this.grades = new HashMap<>();
    }
    public void returnScholarshop(){
        scholarship = true;
    }
    public void loseScholarship(){
        scholarship = false;
    }
    public int receiveScholarship(){
        if(scholarship){
            return 41500;
        }
        else
            return 0;
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
    public void addCourseStudent(Course course){
        grades.put(course,null);
        course.addStudent(this);
    }
    public void updateGrades(Course course){
        grades.put(course,course.getMark(this));
    }
    public void getMyMark(Course course) {
        System.out.println("your assessment: "+course.getMark(this));
    }

    public void viewTranscript() {

        System.out.println("Transcript for " + this.getName() + ":");

        if (grades.isEmpty()) {
            System.out.println("No courses taken yet.");
        } else {
            for (Map.Entry<Course, Double> entry : grades.entrySet()) {
                Course course = entry.getKey();
                updateGrades(course);
                Double grade = entry.getValue();
                System.out.println(course.getName() + ": " + (grade != null ? grade : "Not graded yet"));
            }
        }
    }

    public String toString() {
        return "\n" + "Student {" + super.toString() +
                "  Faculty= "+ faculty +"  "+
                "Speciality= "+ speciality+"  "+
                "year= "+ year + "  " +
                "scholarship= " + scholarship + "  ";
    }
}

