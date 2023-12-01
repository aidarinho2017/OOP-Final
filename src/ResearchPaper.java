import java.util.Vector;

public class ResearchPaper {
    private Vector<User> authors;
    private Vector<String> figures;
    private Vector<String> references;
    private Vector<String> citations;
    private Vector<String> keywords;
    public ResearchPaper(Vector<User> authors, Vector<String> figures, Vector<String> references, Vector<String> citations, Vector<String> keywords) {
        this.authors = authors;
        this.figures = figures;
        this.references = references;
        this.citations = citations;
        this.keywords = keywords;
    }

    public Vector<User> getAuthors() {
        return authors;
    }

    public void addAuthor(User author) {
        this.authors.add(author);
    }

    public Vector<String> getFigures() {
        return figures;
    }

    public void addFigure(String figure) {
        this.figures.add(figure);
    }

    public Vector<String> getReferences() {
        return references;
    }

    public void addReference(String reference) {
        this.references.add(reference);
    }

    public Vector<String> getCitations() {
        return citations;
    }

    public void addCitation(String citation) {
        this.citations.add(citation);
    }

    public Vector<String> getKeywords() {
        return keywords;
    }

    public void addKeyword(String keyword) {
        this.keywords.add(keyword);
    }
    public String toString() {
        StringBuilder description = new StringBuilder();

        description.append("Authors: ");
        appendElements(description, authors);

        description.append("Figures: ");
        appendElements(description, figures);

        description.append("References: ");
        appendElements(description, references);

        description.append("Citations: ");
        appendElements(description, citations);

        description.append("Keywords: ");
        appendElements(description, keywords);

        return description.toString();
    }

    private <T> void appendElements(StringBuilder description, Vector<T> elements) {
        if (elements != null && !elements.isEmpty()) {
            for (T element : elements) {
                description.append(element).append(", ");
            }
            // Remove the trailing comma and space
            description.setLength(description.length() - 2);
        }
        description.append("\n");
    }
}

