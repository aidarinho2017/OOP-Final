public class Test {
    public static void main(String[] args) {
        Student Aidar = new Student("Aidar", 1, "aidar@gmail.com", 18, Gender.Male, "KBTU", 2);
        Student Arsen = new Student("Arsen", 2, "arsen@kbtu.kz", 18, Gender.Male, "AITU", 3);
        Student Aruzhan = new Student("Aruzhan", 3, "aru@kbtu.kz", 18, Gender.Female, "IU", 4);
        Aidar.register("Aidar", "12345");
        Arsen.register("Arsen", "1234567");
        Aruzhan.register("Aru", "aruka");
        Aidar.logIn("Aidar", "12345");
        Aidar.changePassword("aidarTop");
        Arsen.logIn("Arsen", "1234567");
        Aidar.sendMessage(Arsen, "Hello, Bro! ");
        Aidar.sendMessage(Aruzhan, "Hi, sister! ");
        Aidar.sendMessage(Arsen, "I got a new job! ");
        System.out.println(Arsen.getMessages());
        Course OOP = new Course("OOP", 3, Course.CourseType.Major);
        Teacher Pakita = new Teacher("Pakizar", 1, "Pakita@kbtu.kz", 23, Gender.Female, TeacherType.Professor, 999999999);
        Pakita.register("Pakita", "12321");
        Pakita.logIn("Pakita", "12321");
        System.out.println(Pakita.getInfoAboutCourse(OOP));
    }
}
