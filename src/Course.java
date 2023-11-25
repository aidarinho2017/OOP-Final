public class Course {
    private String name;
    private int credits;
    private final CourseType courseType;

    public enum CourseType {
        Major, Minor, Free
    }

    public Course(String name, int credits, CourseType courseType) {
        this.name = name;
        this.credits = credits;
        this.courseType = courseType;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                ", courseType=" + courseType +
                '}';
    }
}