/**
   Celia Liberman
   CS 110
   The Author class. Documents a book author's first
   name, last name, and email address.
*/


public class Author
{
   // Create the fields.
   private String firstName;  // Author's first name.
   private String lastName;  // Author's last name.
   private String emailAddress;  // Author's email address.
   
   /**
      The constructor set the author's names and email
      address. 
      @param fName The author's first name.
      @param lName The author's last name.
      @param email The author's email address.
   */
   
   public Author(String fName, String lName, String email)
   {
      firstName = fName;
      lastName = lName;
      emailAddress = email;
   }
   
   
   /**
      The getFistName method returns the author's first name.
      @return firstName The author's first name. 
   */
   
   public String getFirstName()
   {
      return firstName;
   }
   
   
   /**
      The setFirstName method sets the author's first name 
      to the given string.
      @param first The author's first name.
   */
   
   public void setFirstName(String first)
   {
      firstName = first;
   }
   
   
   /**
      The getLastName method returns the author's last name.
      @return lastName The author's last name. 
   */
   
   public String getLasttName()
   {
      return lastName;
   }
   
      /**
      The setLastName method sets the author's last name 
      to the given string.
      @param last The author's last name.
   */
   
   public void setLastName(String last)
   {
      lastName = last;
   }
   
   
   /**
      The getEmail method returns the author's email address.
      @return emailAddress The author's email address. 
   */
   
   public String getEmail()
   {
      return emailAddress;
   }
   
   /**
      The setEmail method sets the author's email address 
      to the given string.
      @param email The author's email address.
   */
   
   public void setEmail(String email)
   {
      emailAddress = email;
   }
   
   /**
      The toString method.
      @return A string containing the book author's first 
      name, last name, and email address.
   */
   
   public String toString()
   {
      // Create a string with the author's information
      String str = String.format("%s %s <%s>",
                   firstName, lastName, emailAddress);
      
      // Return the string
      return str;
   }
   
   
   /**
      The equals method compares the calling Author object's fields to
      the passed Author object's field and return a corresponding 
      boolean value.
      @parem a An Author object to be compared with calling object.
      @return A boolean value based on whether two objects are equal.
   */
   
   public boolean equals(Author a)
   {
      // Create a boolean field to hold the status (true or
      // false).
      boolean status;
      
      // Test whether this Author object's firstName and lastName 
      // are equal to the calling object's fields.
      if (firstName == a.firstName && lastName == a.lastName)
         status = true;
         
      else
         status = false;
      
      // Return a boolean value based on whether the two objects
      // equal.
      return status;
   }
}