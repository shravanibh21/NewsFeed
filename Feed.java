/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.feed;

import java.util.*;
/**
 *
 * @author shrav
 */
public class Feed {

    private Stack<News> feed;
    //user info
    private int userAge;
    private String userOccup;
    private String userLoc;
    private Map<String, List<String>> selectedInterests; 
    private Set<String> Usertags;

    public Feed(int age, String occup, String loc, Map<String, List<String>> selectedInterests, Set<String> tags) {
        this.feed = new Stack<News>();
        this.userAge = age;
        this.userOccup = occup;
        this.userLoc = loc;
        this.selectedInterests = selectedInterests;
        this.Usertags = tags;
    }

    //Main algorithm to decide which news to include in the user's feed.
    /*This is a weighted score based mock optimization algorithm that takes into account if the intended age,
     intended occupation, location, and content tags match with those of the users. Age and occupation. 

     If the added scores for a given news meet a certain threshold, then it can be added to the feed stack
     which will be returned to the user as their customized feed. Here we consider a dummy threshold of 100.
     */
    public void analyzeNews() {
        for(News curr : NewsDatabase.getNews()) {
            if(curr.intendedAge == this.userAge) curr.scoreForFeed += 10; //compare ages
            if(curr.intendedOccup == this.userOccup) curr.scoreForFeed += 10; //compare occupation
            if(curr.location == this.userLoc) curr.scoreFeed += 5; //compare locations

            //compare tags
            for(String tag : curr.getTags()) {
                for(String userTag : usertags) {
                    if(tag.equals(userTag)) curr.scoreForFeed += 2;
                }
            }

            if(curr.scoreFeed >= 100) feed.push(curr); //meets threshold, push to stack.
        }

    }

}
