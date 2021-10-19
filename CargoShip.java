/**
   Celia Liberman
   CS 110
   The CargoShip class.
*/

public class CargoShip extends Ship
{
   // Create the fields.
   private int cargoCap;  // The cargo ship's cargo capacity in tonnage.
   
   
   /**
      The constructor. 
      @param name The cargo ship's name.
      @param aYear The cargo ship's production year.
      @param cap The cargo capacity in tonnage.
   */
   
   public CargoShip(String name, int aYear, int cap)
   {
      super(name, aYear);
      cargoCap = cap;
   }
   
   
   /**
      The getCargoCapacity method returns the cargo capacity of the
      cargo ship.
      @return The cargo capacity.
   */
   
   public int getCargoCapacity()
   {
      return cargoCap;
   }
      
   
   /**
      The setCargoCapacity method sets the cargo ship's cargo capacity
      to a given integer.
      @param cap The cargo capacity of the cargo ship.
   */
   
   public void setCargoCapacity(int cap)
   {
      cargoCap = cap;
   }
   
   
   /**
      The toString method.
      @return A formatted string with the cargo ship's information.
   */
   @Override
   public String toString()
   {
      // Create formatted string with cargo ship's information.
      String str;
      
      str = String.format("Name: %s \nCargo capacity: %d tons", 
                           super.getShipName(), cargoCap);
                           
      // Return cargo ship's information
      return str;
   }
}
