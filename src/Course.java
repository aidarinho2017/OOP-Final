import java.util.Vector;
import java.util.Arrays;
import java.util.HashMap;
public class Course {
    private String name;
    private int credits;
    private final CourseType courseType;
    int maximumNumberOfStudents;
    int curNumberOfStudents;
    Vector<Student> registeredStudents;
    Vector<Teacher> instructors;
    private HashMap<Student, Double> marks;



    public Course(String name, int credits, CourseType courseType, int maximumNumberOfStudents) {
        this.name = name;
        this.credits = credits;
        this.courseType = courseType;
        this.maximumNumberOfStudents = maximumNumberOfStudents;
        this.curNumberOfStudents = 0;
        this.registeredStudents = new Vector<>();
        this.instructors = new Vector<>();
        this.marks = new HashMap<>();
    }


    public String getName() {
        return name;
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
// if (is teacher)
    public void addMark(Student student,double grades){
        student.updateGrades(this);
        marks.put(student, grades);;
    }
    public Double getMark(Student student) {
        return marks.get(student);
    }

    @Override
    public String toString() {
        return "Course{" + "\n" +
                "name=" + this.name + "\n" +
                " credits=" + this.credits +"\n" +
                " courseType=" + this.courseType +"\n" +
                " current number of students=" + this.curNumberOfStudents + "\n" +
                " enrolled students= "  + Arrays.toString(registeredStudents.toArray()) +
                "\n}";

    }
}