import java.util.Calendar;
import java.util.Iterator;

public class NewsDatabase {
    private static Set<News> news;

    public NewsDatabase() {
        news = new HashSet<News>();
    }

    public Set<News> getNews() {
        return news;
    }
    //Adding newly created news to the database.
    public static void addNews(News addNews) {
        news.add(addNews);
    }

    //This method to be called to be called every 24 hours to get rid of any irrelevant news
    //Don't remove if the engagment score was updated in last 5 days and the score is exceptionally high.
    //This means that the post is still popular and is still worth putting on feeds.
    public void refreshDataBase(){
        Iterator<News> itr = news.iterator();

        while(itr.hasNext()) {
            News curr = itr.next();
            if(Math.abs(curr.datePosted() - Calendar.getInstance().getTime()) >= 14
                && (Math.abs(curr.lastUpdated() - Calendar.getInstance().getTime()) > 5 || curr.getEngagementScore() < 500)) {
                itr.remove();
            }
        }
    }
}
