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

    public static void main(String[] args) {
        System.out.println("ur mother");
    private Stack<News> feed;
    //user info
    private int userAge;
    private String userOccup;
    private String userLoc;
    private Map<String, Integer> scoreBoard;
    private Map<String, List<String>> selectedInterests; 
    private Set<String> Usertags;

    public Feed(int age, String occup, String loc, Map<String, Integer> scoreBoard, Map<String, List<String>> selectedInterests, Set<String> tags) {
        this.feed = new Stack<News>();
        this.userAge = age;
        this.userOccup = occup;
        this.userLoc = loc;
        this.scoreBoard = scoreBoard;
        this.selectedInterests = selectedInterests;
        this.Usertags = tags;
    }

}
