/**
   Celia Liberman
   CS 110
   This program demonstarate the functionality of the Tweet and
   TwitterFeed classes. 
*/

import java.util.Scanner;  // Needed for Scanner object.
import java.io.*;  // Needed for files.
import java.util.ArrayList;  // Needed for ArrayList object.

public class TwitterDriver
{
   public static void main(String[] args) throws IOException
   {
      // The variables.
      String ownerScreenName;  // Feed's owner's screen name.
      String authorScreenName;  // Tweet's author's screen name.
      String tweet;  // The tweet.
      ArrayList<Tweet> billGatesTweets;  // An ArrayList of Bill Gates'
                                         // tweets.
      
      // Open the feed file.
      File inputFile = new File("feed1.txt");
      Scanner feed = new Scanner(inputFile);
      
      // Set the first line to be the owner's screen name.
      ownerScreenName = feed.nextLine();
      
      // Create a TwitterFeed object
      TwitterFeed theFeed = new TwitterFeed(ownerScreenName);
      
      // Load the contents of the file into the TwitterFeed
      while (feed.hasNext())
      {
         // Set the tweet and author's screen name to a string 
         // from the file.
         authorScreenName = feed.nextLine();
         tweet = feed.nextLine();
         
         // Create a tweet object.
         Tweet aTweet = new Tweet(authorScreenName, tweet);
         
         // Add Tweet object to the TwitterFeed object.
         theFeed.addTweet(aTweet);
      }
      
      // Call the toString method
      System.out.println(theFeed);
      
      // Call the tweetsBy method.
      billGatesTweets = theFeed.tweetsBy("BillGates");
      
      // Display the contents of the ArrayList created by the
      // tweetBy method.
      for (Tweet aTweet : billGatesTweets)
      {
         System.out.println(aTweet);
      }
      
   }
}