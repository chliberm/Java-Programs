/**
   Celia Liberman
   CS 110
   
*/

import java.util.*;  // Needed for user input.
import java.io.*;  // Needed for files.


public class FileDriver
{
   public static void main(String[] args)
   {
      String fileName;  // The name of the names file.
      int numNames;  // Number of names to be searched through.
      String[] names;  // An array of names.
      
      // Prompt user for the name of the file.
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the file name: ");
      fileName = input.nextLine();
      
      // Prompt user for the number of names in the file.
      try
      {
         System.out.print("How many names would you like to search"
                       + " through? ");
         numNames = input.nextInt();
         while (numNames <=0)
         {
            System.out.println("Enter a positive integer value");
            numNames = input.nextInt();
         }
      }
      
      catch (InputMismatchException e)
      {
         System.out.println(input.nextLine() + " is not an integer");
         System.out.println("Enter a positive integer value");
         numNames = input.nextInt();
         while (numNames <=0)
         {
            System.out.println("Enter a positive integer value");
            numNames = input.nextInt();
         }
      }
      
      
      // Create an array to hold the names.
      names = new String[numNames];
      
      // Load the names into the array of Strings.
      int numElem;  // Holds the number of elements added to the array.
      numElem = ArrayFunctions.readArray(fileName, names);  
      if (numElem == 0)
         System.out.println("An error occurd. There are no names in the list.");
      
      else if (numElem < numNames)
      {
         System.out.println("The array is partially full, there are only "
                            + numElem + " names in the array");
      }
      
      if (numElem != 0)
      {
         // Sort the names.
         ArrayFunctions.selectionSort(names, 0, numElem);
         
         // Write the sorted data to a new file.
         String sortedFileName = "sorted_" + fileName;
         boolean success = ArrayFunctions.writeArray(sortedFileName, names);
         if (success == false)
            System.out.println("Write was unsuccessful.");
         
         // Search for a specific name in the array 
         System.out.print("Enter the name to be searched: ");
         Scanner nameInput = new Scanner(System.in);
         String name = nameInput.nextLine();
         int nameIndex = ArrayFunctions.binarySearch(names, 0, numElem, name);
         if (nameIndex == -1)
            System.out.println("The name " + name + " is not on the list");
         else
            System.out.printf("%s was the %d on the list\n", name, nameIndex + 1);
      }
   }
}