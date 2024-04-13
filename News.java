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
    private Set<String> tags;

    public News() {
        this("", "", Calendar.getInstance().getTime(), new HashMap<>(), 0, Calendar.getInstance().getTime(), 0, 0, "");
    }

    public News(String t, String a, Date d, Map<String, User> u, int e, Date l, int ia, int io, String lo, Set<String> tags) {
        this.title = t;
        this.author = a;
        this.datePosted = d;
        this.usersVisited = u;
        this.engagementScore = calculateEngagement();
        this.lastUpdated = l;
        this.intendedAge = ia;
        this.intendedOccup = io;
        this.location = lo;
        this.tags = tags;
    }

    public int calculateEngagement() {
        int score = (this.usersVisited.get(revists)*10) + (this.usersVisited.get(shadeTaps)*8) + (this.usersVisited(readMoreTaps)*8) +
            (this.usersVisited.get(shares)*6) + (this.usersVisited.get(pollFriends)*6) + (this.usersVisited.get(takes)*4) + (this.usersVisited.get(pollVotes)*4);
        
        if(isLiked == 1) score++;
        if(isDisliked == 1) score++;

        return score;
    }

    public void userVisited(User user, String name) {
        if (this.usersVisited.keySet().contains(name)){
            this.usersVisited.get(name).incrementVisit();
            return;
        }
        this.usersVisited.put(name, user);
    }
    
    public void setEngagementScore(int e) {
        this.engagementScore = e;
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

   
}

