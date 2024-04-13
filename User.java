import java.util.*;

public class User {
    private String name;
    private String userName;
    private String userLocation;
    private String userOccup;
    private int userAge;
    private Map<String, Integer> scoreBoard; //activties and counts/isTrue values
    private Map<String, List<String>> selectedInterests; //based on selections from onboarding
    private Set<String> tags; //tags user has interacted with the most.

    private String[] activities = {"visit", "read-more", "share/poll", "poll/comment", "like", "dislike"};
    private int[] scores = {10, 8, 4, 2, 1, -2};

    Feed feed = new Feed();

    public User(String name, String userName, String loc, String occup, int age) {
        this.name = name;
        this.userName = userName;
        this.userLocation = loc;
        this.userOccup = occup;
        this.userAge = age;
        this.scoreBoard = new HashMap<String, Integer>(); 
        for (int i = 0; i < activities.length; i++) {
            this.scoreBoard.put(activities[i], 0);
        }
        this.selectedInterests = new HashMap<String, List<String>>();
        this.tags = new HashSet<String>();
    }

    public void incrementVisit() {
        this.scoreBoard.put("visit", this.scoreBoard.get("visit") + 1);
    }

}
