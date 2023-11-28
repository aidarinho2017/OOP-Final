import java.util.Vector;

public class Diploma {
    private String title;
    private String field;
    private int yearEarned;
    private Vector<ResearchPaper> researchPapers;

    public Diploma(String title, String field, int yearEarned) {
        this.title = title;
        this.field = field;
        this.yearEarned = yearEarned;
        this.researchPapers = new Vector<>();
    }

    public String getTitle() {
        return title;
    }

    public String getField() {
        return field;
    }

    public int getYearEarned() {
        return yearEarned;
    }

    public Vector<ResearchPaper> getResearchPapers() {
        return researchPapers;
    }

    public void addResearchPaper(ResearchPaper researchPaper) {
        researchPapers.add(researchPaper);
    }
}
