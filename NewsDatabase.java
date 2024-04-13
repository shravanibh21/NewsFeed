import java.util.Calendar;
import java.util.Iterator;

public class NewsDatabase {
    private static Set<News> news;

    public NewsDatabase() {
        news = new HashSet<News>();
    }

    //
    public static void addNews(News addNews) {
        news.add(addNews);
    }
    //This method to be called to be called every 24 hours to get rid of any irrelevant news
    public void refreshDataBase(){
        Iterator<News> itr = news.iterator();

    }
}
