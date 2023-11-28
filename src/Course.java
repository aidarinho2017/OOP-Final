import java.util.Vector;
public class Course {
    private String name;
    private int credits;
    private final CourseType courseType;
    int maximumNumberOfStudents;
    int curNumberOfStudents;
    Vector<Student> registeredStudents;
    Vector<Teacher> instructors;

    public Course(String name, int credits, CourseType courseType, int maximumNumberOfStudents) {
        this.name = name;
        this.credits = credits;
        this.courseType = courseType;
        this.maximumNumberOfStudents = maximumNumberOfStudents;
        this.curNumberOfStudents = 0;
        this.registeredStudents = new Vector<>();
        this.instructors = new Vector<>();
    }
    public void addStudent(Student student) {
        if (curNumberOfStudents < maximumNumberOfStudents) {
            this.registeredStudents.add(student);
            curNumberOfStudents++;
            System.out.println(student.getName() + " has been added to the course " + this.name);
        } else {
            System.out.println("Cannot add more students. Maximum limit reached for course " + this.name);
        }
    }
    public void addInstructor(Teacher instructor){
        this.instructors.add(instructor);
    }

    public void deleteStudent(Student student) {
        if (this.registeredStudents.remove(student)) {
            curNumberOfStudents--;
            System.out.println(student.getName() + " has been removed from the course " + this.name);
        } else {
            System.out.println(student.getName() + " is not registered for the course " + this.name);
        }
    }
    @Override
    public String toString() {
        return "Course{" +
                "name='" + this.name + '\'' +
                ", credits=" + this.credits +
                ", courseType=" + this.courseType +
                ", current number of students=" + this.curNumberOfStudents;
    }
}