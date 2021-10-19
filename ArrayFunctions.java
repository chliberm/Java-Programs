/**
   Celia Liberman
   CS 110
   The ArrayFunctions class. Has four static methods
   that work with an array of String objects.
*/

import java.util.Scanner;  // Needed for file input.
import java.io.*;  // Needed for file.


public class ArrayFunctions
{
   /**
      The readArray method reads a file containing names and adds
      the names to an array of String objects.
      @param fileName The name of the file containg the list of names.
      @param nameList An array to which names will be added.
      @return The number of names added or 0 if an error is thrown.
   */
   
   public static int readArray(String fileName, String[] nameList)
   {
      try
      {
         // Open file.
         File file = new File(fileName);
         Scanner nameFile = new Scanner(file);
         
         try
         {
            // Read the names in the file and add them to the nameList.
            int count = 0;
            int i = 0;
            while (nameFile.hasNext() && i < nameList.length)
            {
               String name = nameFile.nextLine();
               nameList[i] = name;
               
               i++;   
               count++; 
            }
            
            // Return number of names added to array.
            return count;  
         }
         
         catch (NullPointerException e)
         {
            return 0;
         }
         
         finally
         {
            nameFile.close();
         }
      }
      
      // Catch errors for a null reference and file not found.
      catch (FileNotFoundException e)
      {
         return 0;
      }
   }
   
   
   /**
      The writeArray method will write the names from an array of Strings
      to a file preceded by numbers. Returns a boolean value.
      @param fileName The name of a file to be written to.
      @param nameArray An array of Strings containing names.
      @retrun Boolean value indicating if the writing was successful.
   */
   
   public static boolean writeArray(String fileName, String[] nameArray)
   {
      try
      {
         // Open file.
         PrintWriter outputFile = new PrintWriter(fileName);
         
         try
         {
            // Write the names from the array to the file preceded by numbers.
            int count = 1;        
            for (String name : nameArray)
            {
               outputFile.println(count + ": " + name);
               count++;
            }
            
            // Return true if the write was successful.
            return true;
         }
         
         catch (NullPointerException e)
         {
            return false;
         }
         
         finally
         {
            outputFile.close();
         }
      }
      
      catch (IOException e)
      {
         return false;
      }
   }
   
   
   /**
      The selectionSort method sorts an array using the selection
      sort algorithm.
      @param nameArray An array of Strings containing names.
      @param start An integer representing the index of the
             start element.
      @param n The number of elements in the array.
   */
   
   public static void selectionSort(String[] nameArray, int start,
                                    int n)
   {
      int startScan, index, minIndex;
      String minValue;
      
      for (startScan = start; startScan < n-1; startScan++)
      {
         minIndex = startScan;
         minValue = nameArray[startScan];
         
         for (index = startScan + 1; index < n; index++)
         {
            if (nameArray[index].compareTo(minValue) < 0)
            {
               minValue = nameArray[index];
               minIndex = index;
            }
         }
      nameArray[minIndex] = nameArray[startScan];
      nameArray[startScan] = minValue;
      }
   }
   
   
   /**
      The binarySearch method is a recrusive searche of an array
      of names for a specific name.
      @param nameArray An array of Strings containing names.
      @param first The index of the first element.
      @param last The index of the last element.
      @param name The name to be search.
      @return The index of the name if it is found or -1 otherwise.
   */
   
   public static int binarySearch(String[] nameArray, int first, int
                                  last, String name)
   {
      int middle;  // Mid point of the search.
      
      // Test for the base case where the value is not found.
      if (first > last)
         return -1;
         
      // Calculate the middle postion.
      middle = (first + last) / 2;
      
      // Search for the name.
      if (nameArray[middle].equals(name))
         return middle;
      
      else if (nameArray[middle].compareTo(name) < 0)
         return binarySearch(nameArray, middle + 1, last, name);
      
      else
         return binarySearch(nameArray, first, middle - 1, name);
   }
}

