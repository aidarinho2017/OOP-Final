public class Test {
    public static void main(String[] args) {

        Course Math = new Course("Math",5,CourseType.Minor,10);

        Student Aidar = new Student("Aidar", 1, "aidar@gmail.com", 18, Gender.Male,Faculty.MARITIME_ACADEMY, 2,false, "IS");
        Student Arsen = new Student("Arsen", 2, "arsen@kbtu.kz", 18, Gender.Male, Faculty.MARITIME_ACADEMY, 3,true, "IS");
        Student Aruzhan = new Student("Aruzhan", 3, "aru@kbtu.kz", 18, Gender.Female, Faculty.BUSINESS, 4,false, "IS");

        System.out.println(Math.toString());

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

        Course OOP = new Course("OOP", 3, CourseType.Major, 100);

        Teacher Pakita = new Teacher("Pakizar", 1, "Pakita@kbtu.kz", 23, Gender.Female, TeacherType.Professor, 999999999);

        Pakita.register("Pakita", "12321");
        Pakita.logIn("Pakita", "12321");

        Aidar.addCourseStudent(OOP);
        Arsen.addCourseStudent(OOP);

        Aidar.addCourseStudent(Math);

        OOP.addMark(Arsen,4);
        Arsen.getMyMark(OOP);
        Aidar.getMyMark(OOP);

        Aidar.viewTranscript();
        Arsen.viewTranscript();
        System.out.println(OOP.toString());

        System.out.println(Pakita.getInfoAboutCourse(OOP));

        StudentOrganization osit = new StudentOrganization("OSIT");

        osit.addMember(Arsen);
        osit.addMember(Aidar);

        osit.displayMembers();

        osit.setHead(Arsen);
        osit.displayHead();

    }
}