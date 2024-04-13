import java.util.*;

public class News implements Comparable<News> {
    private String title;
    private String author;
    private Date datePosted;
    private Map<String, User> usersVisited;
    private int engagementScore;
    private Date lastUpdated;
    private int intendedAge;
    private int intendedOccup;
    private String location;

    public News() {
      //  this("", "", new Date(), new HashMap<>(), 0, new Date(), 0, 0, "");
    }

    public News(String t, String a, Date d, Map<String, User> u, int e, Date l, int ia, int io, String lo) {
        this.title = t;
        this.author = a;
        this.datePosted = d;
        this.usersVisited = u;
        this.engagementScore = e;
        this.lastUpdated = l;
        this.intendedAge = ia;
        this.intendedOccup = io;
        this.location = lo;
    }

    public void update(int e) {
        this.engagementScore = e;
        this.lastUpdated = Calendar.getInstance().getTime();
    }

    public int compareTo(News other) {
        return lastUpdated.compareTo(lastUpdated);
    }
}

