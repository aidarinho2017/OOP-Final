import java.util.Vector;

public class PHDStudent extends Student {
    private Diploma diploma;

    public PHDStudent(String name, int id, String email, int age, Gender gender, String university, int year) {
        super(name, id, email, age, gender, university, year);
        this.login = null;
        this.password = null;
        this.registered = false;
        this.authorized = false;
        this.diploma = null;
    }

    public Diploma getDiploma() {
        return diploma;
    }

    public void setDiploma(Diploma diploma) {
        this.diploma = diploma;
    }

    // Additional methods for interacting with the Diploma
    public void submitResearchPaper(Vector<User> authors, Vector<String> figures, Vector<String> references,
                                    Vector<String> citations, Vector<String> keywords) {
            ResearchPaper researchPaper = new ResearchPaper(authors, figures, references, citations, keywords);
            diploma.addResearchPaper(researchPaper);

    }

    public void printDiplomaDetails() {
        if (diploma != null) {
            System.out.println("Diploma Details:");
            System.out.println("Title: " + diploma.getTitle());
            System.out.println("Field: " + diploma.getField());
            System.out.println("Year Earned: " + diploma.getYearEarned());

            Vector<ResearchPaper> researchPapers = diploma.getResearchPapers();
            if (!researchPapers.isEmpty()) {
                System.out.println("Research Papers:");
                for (ResearchPaper researchPaper : researchPapers) {
                    System.out.println("Authors: " + researchPaper.getAuthors());
                    System.out.println("Figures: " + researchPaper.getFigures());
                    System.out.println("References: " + researchPaper.getReferences());
                    System.out.println("Citations: " + researchPaper.getCitations());
                    System.out.println("Keywords: " + researchPaper.getKeywords());
                }
            } else {
                System.out.println("No research papers available.");
            }
        } else {
            System.out.println("No diploma information available.");
        }
    }
}