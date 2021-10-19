/**
   Celia Liberman
   CS 110
   The LoadedDice class derived from the Random class.
*/

import java.util.Random;  // Needed for the Random class.

public class LoadedDice extends Random
{
   /**
      The nextInt method overrides the Random class's 
      nextInt method. 
      @param n The number up to which an integer should be 
             randomly selected.
      @return 50% of the time will return the largest number,
              the rest of the time it returns a number between
              0 to n-2.
   */
   @Override
   public int nextInt(int n)
   {
      Random random = new Random();
      int x = random.nextInt(2);
      if(x == 1)
         return n-1;
      else
         return random.nextInt(n-2);
   }
}