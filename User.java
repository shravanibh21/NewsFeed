public class User {
    String name;
    String userName;
    String userLocation;
    String userOccup;
    int userAge;
    Map<String, Integer> scoreBoard;
    Map<String, List<String>> selectedInterests;
    Set<String> tags;

    //Feed feed = new Feed();

    public User(String name, String userName, String loc, String occup, int age) {
        this.name = name;
        this.userName = userName;
        this.userLocation = loc;
        this.userOccup = occup;
        this.userAge = age;
    }

}
