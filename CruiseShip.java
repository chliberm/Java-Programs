/**
   Celia Liberman
   CS 110
   The CruiseShip class. An extension of the Ship class. 
*/

public class CruiseShip extends Ship
{
   // Create the fields.
   private int maxPassengers;  // The maximum number of passengers.
   
   
   /**
      The constructor. 
      @param name The cruise ship's name.
      @param aYear The cruise ship's production year.
      @param max The maximum number of passengers.
   */
   
   public CruiseShip(String name, int aYear, int max)
   {
      super(name, aYear);
      maxPassengers = max;
   }
   
   
   /**
      The getMaxPassengers method returns the max number of passengers
      the cruise ship can hold.
      @return The maximum number of passengers.
   */
   
   public int getMaxPassengers()
   {
      return maxPassengers;
   }
      
   
   /**
      The setMaxPassengers method sets the maximum number of passengers
      the cruise ship can hold to a given integer.
      @param maxPass The maximum number of passengers.
   */
   
   public void setMaxPassengers(int maxPass)
   {
      maxPassengers = maxPass;
   }
   
   
   /**
      The toString method.
      @return A formatted string with the cruise ship's information.
   */
   @Override
   public String toString()
   {
      // Create formatted string with cruise ship's information.
      String str;
      
      str = String.format("Name: %s \nMax number of passengers: %d", 
                           super.getShipName(), maxPassengers);
                           
      // Return cruise ship's information
      return str;
   }
}