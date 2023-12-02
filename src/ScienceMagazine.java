import java.util.Vector;

public class ScienceMagazine {
    private final String magazineName;

    public ScienceMagazine(String magazineName) {
        this.magazineName = magazineName;
    }

    public void Citate(ResearchPaper researchPaper) {
        researchPaper.addCitation(magazineName);
    }
}