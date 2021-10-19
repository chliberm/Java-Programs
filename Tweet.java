/**
   Celia Liberman
   CS 110
   The Tweet class. Has two instance variables: screen name and
   the content of the tweet. This class has a constructor, a copy
   constructor, a toString method, getters and setters, and an
   equals method.
*/

public class Tweet
{
   // Initialize the class constant.
   public static final int MAX_CHARS = 140;  // The max number of chars
                                         // in a tweet
   
   // Create the fields.
   private String screenName;  // The tweet's author screen name.
   private String content;  // The content of the tweet.
   
   
   /**
      The constructor.
      @param name A screen name
      @param text The content of the tweet as text
   */
   
   public Tweet(String name, String text)
   {
      screenName = name; 
      
      if (text.length() > MAX_CHARS)
      {
         content = String.format("%.140s", text);
      }
      
      else
         content = text;
   }
   
   
   /**
      The copy constructor. Creates a deep copy of the calling
      Tweet object.
      @param aTweet A tweet object to be copied
   */
   
   public Tweet(Tweet aTweet)
   {
      screenName = aTweet.screenName;
      content = aTweet.content;
   }
   
   
   /**
      The getScreenName returns the tweet's author's screen name.
      @return screenName The author's screen name.
   */
   
   public String getScreenName()
   {
      return screenName;
   }
   
   
   /**
      The getContent method returns the tweet's content.
      @return content The tweet's content as text.
   */
   
   public String getContent()
   {
      return content;
   }
   
   
   /**
      The setScreenName method sets the tweet's auhtor's screen
      name to the given name.
      @param name A screen name.
   */
   
   public void setScreenName(String name)
   {
      screenName = name;
   }
   
   
   /**
      The setContent method sets the tweet's cotent to the given
      text (only the first 140 characters).
      @param text A string.
   */
   
   public void setContent(String text)
   { 
      if (text.length() > MAX_CHARS)
      {
         content = String.format("%.140s", text);
      }
   }
   
   
   /**
      The toString method.
      @return str A formatted string with the tweet's information.
   */
   
   public String toString()
   {
      // Create a formatted string
      String str = String.format("@%s\n\"%s\"", screenName, content);
      
      // Return the information string
      return str;
   }
   
   /**
      The equals method compares two tweet objects.
      @return boolean value based on whether the two objects are the same.
   */
   
   public boolean equals(Tweet t)
   {
      // Create a boolean field to hold the status (true or
      // false).
      boolean status;
      
      // Test whether this tweet object's screenName and content 
      // are equal to the calling object's fields.
      if (screenName.equals(t.screenName) && content.equals(t.content))
         status = true;
         
      else
         status = false;
      
      // Return a boolean value based on whether the two objects
      // equal.
      return status;
   }
}