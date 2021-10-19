/**
   Celia Liberman
   CS 110
   The abstact Ship class. 
*/

public abstract class Ship
{
   // Create the fields.
   private String shipName;  // The ship's name.
   private int year;  // The year the ship was built.
   
   
   /**
      The constructor.
      @param name A ship's name.
      @param aYear A ship's production year.
   */
   
   public Ship(String name, int aYear)
   {
      shipName = name; 
      year = aYear;
   }
   
   
   /**
      The getShipName method returns the name of the ship.
      @return The ship's name.
   */
   
   public String getShipName()
   {
      return shipName;
   }
   
   
   /**
      The getYear method returns the year the ship was made.
      @return The year the ship was made.
   */
   
   public int getYear()
   {
      return year;
   }
   
   
   /**
      The setShipName method sets the name of the ship to the
      given String.
      @param aName A ship's name.
   */
   
   public void setShipName(String aName)
   {
      shipName = aName;
   }
   
   
   /**
      The setYear method sets the year the ship was built to a
      given integer.
      Must be overridden in a subclass.
      @param aYear A ship's year of production.
   */
   
   public void setYear(int aYear)
   {
      year = aYear;
   }
   
   
   /**
      The toString method.
      @return str A formatted string with the ship's information.
   */
   
   public String toString()
   {
      // Create the formatted String with the ship's information.
      String str;
      
      str = String.format("Name: %s \nYear of production: %d", 
                           shipName, year);
      
      // Return the ship's information.                     
      return str;
   }
}