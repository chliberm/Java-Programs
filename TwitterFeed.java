/**
   Celia Liberman
   CS 110
   The TwitterFeed class. Contains the screen name of the owner of
   the feed and the collection of tweets that exist on their feed. 
*/

import java.util.ArrayList;  // For ArrayList.


public class TwitterFeed
{
   // Create the private constant.
   private static final int INITIAL_CAPACITY = 100;  // The array list
                                                     // of tweet's 
                                                     // initial capacity.
   
   // Create the fields.
   private String screenName;  // The owner's screen name.
   private ArrayList<Tweet> tweetsList;  // The ArrayList of tweets.
   
   
   /**
      The constructor. Takes a screen name as an argument and intializes
      the tweetsList to INITIAL_CAPACITY.
      @param name A screen name.
   */
   
   public TwitterFeed(String name)
   {
      screenName = name;
      tweetsList = new ArrayList<Tweet>(INITIAL_CAPACITY);
   }
   
   
   /**
      The getScreenName method returns the owner's screen name.
      @return screenName The owner's screen name.
   */
   
   public String getScreenName()
   {
      return screenName;
   }
   
   /**
      The getFeed makes a deep copy of the ArrayList and each Tweet
      reference.
      @param aFeed An arrayList of tweets. 
   */
   
   public void getFeed(ArrayList<Tweet> aFeed)
   {
      for (Tweet aTweet : aFeed)
         tweetsList.add(aTweet);
   }
   
   
   /**
      The addTweet method adds a tweet to the tweetsList.
      @param name The tweet author's screen name.
      @param content The tweet's contents.
   */
   
   public void addTweet(String name, String content)
   {
      Tweet aTweet = new Tweet(name, content);
      tweetsList.add(aTweet);
   }
   
   
   /**
      The addTweet method adds a tweet to the tweetsList.
      @param aTweet A Tweet object to be added.
   */
   
   public void addTweet(Tweet aTweet)
   {
      tweetsList.add(aTweet);

   
   /**
      The toString method.
      @return str A formatted string with all the tweets.
   */
   
   public String toString()
   {
      String str = "";
      for(Tweet aTweet : tweetsList)
         str += String.format("@%s\n%s\n", screenName, aTweet);
      
      return str;
   }
   
   
   /**
      The tweetsBy method takes a String and returns an ArrayList
      of all the Tweet by the specified screen name.
      @param name The author's screen name.
      @return array An ArrayList of Tweets by the author.
   */
   
   public ArrayList<Tweet> tweetsBy(String name)
   {
      ArrayList<Tweet> array = new ArrayList<Tweet>();
      
      for(Tweet aTweet : tweetsList)
      {
         if(name.equals(aTweet.getScreenName()))
         {
            array.add(aTweet);
         }
      }
      
      return array;
   }
}