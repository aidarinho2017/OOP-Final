public interface CanDoResearch {
    void becomeAnAuthor(ResearchPaper researchPaper);
    void addReference(ResearchPaper researchPaper, String reference);
    void addFigure(ResearchPaper researchPaper, String figure);
}
