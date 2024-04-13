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

    private Feed feed;

    public User(String name, String userName, String loc, String occup, int age) {
        this.name = name;
        this.userName = userName;
        this.userLocation = loc;
        this.userOccup = occup;
        this.userAge = age;
        this.scoreBoard = new HashMap<String, Integer>(); 
        //initialize scoreboard
        scoreBoard.put(revists, 0); //+10
        scoreBoard.put(shadeTaps, 0); //+8
        scoreBoard.put(readMoreTaps, 0); //+8
        scoreBoard.put(shares, 0); //+6
        scoreBoard.put(pollFriends, 0); //+6
        scoreBoard.put(takes, 0); //+4
        scoreBaord.put(pollVotes, 0); //+4
        scoreBoard.put(like, 0); //acts as a boolean +2
        scoreBoard.put(dislike, 0); //acts a a boolean -5

        this.selectedInterests = new HashMap<String, List<String>>();
        this.tags = new HashSet<String>();
        this.feed = new Feed(userAge, userOccup, userLocation, scoreBoard, selectedInterests, tags);
    }
    

}
