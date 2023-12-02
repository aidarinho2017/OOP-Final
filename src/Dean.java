import java.util.ArrayList;
import java.util.List;

public class Dean extends User{
    String login;
    String password;
    boolean registered;
    boolean authorized;
    List<String> messages;
    List<String> highImportanceComplaints;
    List<String> mediumImportanceComplaints;
    List<String> lowImportanceComplaints;


    Dean(String name, int id, String email, int age, Gender gender) {
        super(name, id, email, age, gender);
        this.login = null;
        this.password = null;
        this.registered = false;
        this.authorized = false;
        this.messages = new ArrayList<>();
        this.highImportanceComplaints = new ArrayList<>();
        this.mediumImportanceComplaints = new ArrayList<>();
        this.lowImportanceComplaints = new ArrayList<>();
    }
    public void readComplaints(ComplaintImportance complaintImportance) {
        if(complaintImportance.equals(ComplaintImportance.High)) {
            System.out.println("High Importance Complaints:");
            readComplaintList(highImportanceComplaints);
        }
        if(complaintImportance.equals(ComplaintImportance.Medium)) {
            System.out.println("\nMedium Importance Complaints:");
            readComplaintList(mediumImportanceComplaints);
        }
        if(complaintImportance.equals(ComplaintImportance.Low)) {
            System.out.println("\nLow Importance Complaints:");
            readComplaintList(lowImportanceComplaints);
        }
    }
    private void readComplaintList(List<String> complaints) {
        for (String complaint : complaints) {
            System.out.println(complaint);
        }
    }


    public void addComplaint(String complaint, ComplaintImportance importance) {
        switch (importance) {
            case High:
                highImportanceComplaints.add(complaint);
                break;
            case Medium:
                mediumImportanceComplaints.add(complaint);
                break;
            case Low:
                lowImportanceComplaints.add(complaint);
                break;
        }
    }
}
