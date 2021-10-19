/**
   Celia Liberman
   CS 110
   Determining how many grosses, dozens, and sinlge eggs Jackie sold
*/

import java.util.Scanner; // Needed for the Scanner class

public class Eggs
{
   public static void main(String[] args)
   {
      // Variables to hold the number of grosses, dozens, and single eggs
      int eggsSold,
          gross, 
          dozen, 
          single;
      
      // Display initial message
      System.out.println("Jackie's Egg Layers");
      
      // Recieve number of total eggs sold
      Scanner keyboard = new Scanner(System.in);
      System.out.print("How many eggs did you sell this month? ");
      eggsSold = keyboard.nextInt();
      
      // Find number of grosses and adjust eggs sold variable
      gross = eggsSold / 144;
      eggsSold = eggsSold - gross * 144;
      
      // Find number of dozens and adjust eggs sold total
      dozen = eggsSold / 12;
      eggsSold = eggsSold - dozen * 12;
      
      // Find number of single eggs left
      single = eggsSold;
      
      
      // Display resulting number of eggs sold
      System.out.println("You sold " + gross + " gross of eggs");
      System.out.println("You sold " + dozen + " dozen of eggs");
      System.out.println("You sold " + single + " individual eggs");
   }
}