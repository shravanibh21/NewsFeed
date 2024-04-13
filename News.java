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
        this("", "", Calendar.getInstance().getTime(), new HashMap<>(), 0, Calendar.getInstance().getTime(), 0, 0, "");
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

    public void setTitle(String t) {
        this.title = t;
    }

    public void setAuthor(String a) {
        this.author = a;
    }

    public void setDatePosted(Date d) {
        this.datePosted = d;
    }

    public void addUser(String name, User obj) {
        this.usersVisited.put(name, obj);
    }
    
    public void setEngagementScore(int e) {
        this.engagementScore = e;
    }

    public void setIntendedAge(int a) {
        this.intendedAge = a;
    }

    public void setIntendedOccup(int o) {
        this.intendedOccup = o;
    }

    public void setLocation(String l) {
        this.location = l;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public Date getDatePosted() {
        return this.datePosted;
    }

    public Set<String> getUserSet() {
        return usersVisited.keySet();
    }

    public User getUser(String name) {
        if (this.usersVisited.keySet().contains(name)){
            this.usersVisited.get(name).incrementVisit();
            return this.usersVisited.get(name);
        }
        return null;
    }

    public int getEngagementScore() {
        return this.engagementScore;
    }

    public int getIntendedAge() {
        return this.intendedAge;
    }

    public int getIntendedOccup() {
        return this.intendedOccup;
    }

    public String getLocation() {
        return this.location;
    }

    public void update(int e) {
        this.engagementScore = e;
        this.lastUpdated = Calendar.getInstance().getTime();
    }

    public int compareTo(News other) {
        return lastUpdated.compareTo(lastUpdated);
    }

    public int likeliness(User user) {
        return 0;
    }
}

