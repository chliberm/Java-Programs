/**
   Celia Liberman
   CS 110
   This program tests the abstract class Ship and it's
   subclasses CruiseShip and CargoShip.
*/

import java.util.ArrayList;  // Needed for ArrayList.

public class ShipDriver
{
   public static void main(String[] args)
   {
      // Create the fields.
      ArrayList<Ship> shipList = new ArrayList<Ship>();  // A list of Ship objects.
      
      
      // Create the four ship objects.
      Ship ship1 = new CruiseShip("The Stella-May", 2007, 9000);
      Ship ship2 = new CargoShip("Ocean Spray", 2010, 300);
      Ship ship3 = new CargoShip("The Monster", 2000, 700);
      Ship ship4 = new CruiseShip("The Cruiser", 2011, 15000);
      
      
      // Add the ship objects to the ArrayList.
      shipList.add(ship1);
      shipList.add(ship2);
      shipList.add(ship3);
      shipList.add(ship4);
      
      
      // Display the toString method for each of the objects 
      // in the shipList.
      for(Ship aShip : shipList)
      {
         System.out.println(aShip);
      }
   }
}