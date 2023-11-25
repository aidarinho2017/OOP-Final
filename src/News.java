import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class News {
    public Deque<String> newsDeque;
    public Map<String, String> newsComments;

    public News() {
        newsDeque = new ArrayDeque<>();
        newsComments = new HashMap<>();
    }

    public void addNews(String news, String typeOfNews) {
        if (typeOfNews.equals("Research")) {
            newsDeque.addFirst(news);
        } else {
            newsDeque.addLast(news);
        }
    }

    public void addComment(String news, String comment) {
        newsComments.put(news, comment);
    }
    public void readNews() {
        for (String news : newsDeque) {
            System.out.println(news);
            if (newsComments.containsKey(news)) {
                System.out.println("Comment: " + newsComments.get(news));
            }
            System.out.println();
        }
    }
}