import java.util.ArrayList;
import java.util.List;

public class StudentOrganization {
    private String name;
    private List<Student> members;
    private Student head;

    public StudentOrganization(String name) {
        this.name = name;
        this.members = new ArrayList<>();
        this.head = null;
    }

    public String getName() {
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    public void addMember(Student student) {
        members.add(student);
        System.out.println(student.getName() + " has joined " + this.name);
    }

    public void setHead(Student head) {
        if (members.contains(head)) {
            this.head = head;
            System.out.println(head.getName() + " is now the head of " + this.name);
        } else {
            System.out.println("Cannot set head. " + head.getName() + " is not a member of " + this.name);
        }
    }

    public void displayMembers() {
        System.out.println("Members of " + this.name + ":");
        for (Student member : members) {
            System.out.println("- " + member.getName());
        }
    }

    public void displayHead() {
        if (head != null) {
            System.out.println("Head of " + this.name + ": " + head.getName());
        } else {
            System.out.println("No head assigned for " + this.name);
        }
    }
}

