/**
   Celia Liberman
   CS 110
   This program reads a file containing a list of integer and tests them for 
   3 characteristics, whether they have repeating (adjacent) digits, are even,
   and are prime. The program then opens a new file containing a table of the
   number analysis.
*/

import java.util.Scanner;  // Needed for Scanner Class
import java.io.*;  // Needed for File IO Class

public class NumberTester
{
   public static void main(String[] args) throws IOException
   {
      // Open the input file.
      File file = new File("numbers.txt");
      Scanner numberFile = new Scanner(file);
      
      // Open the output file.
      PrintWriter numberTableFile = new PrintWriter("numberSummary.txt");
      
      // Add table header to summary file
      String header1 = String.format("%14s", "Repeat");
      String header2 = String.format("%7s %7s %7s %7", "Number", "Digits", "Even", "Prime");
      numberTableFile.println(header1);
      numberTableFile.println(header2);
      
      // Read all the integers in the file and test for characteristics
      String primeSign, evenSign, repeatedSign;
      while (numberFile.hasNext())
      {
         // Read a value from the file.
         int number = numberFile.nextInt();
         
         // Test if the integer is prime.
         boolean prime = isPrime(number);
         if (prime == true)
            primeSign = "+";
         else
            primeSign = "-";
            
         // Test if the integer is even.
         boolean even = isEven(number);
         if (even == true)
            evenSign = "+";
         else
            evenSign = "-";
            
         // Test if the integer has repeated. 
         boolean repeated = isRepeatedDigits(number);
         if (repeated == true)
            repeatedSign = "+";
         else
            repeatedSign = "-";
         
         // Print row of table based on the test boolean values
         String row = String.format("%5d %7s %7s %7s", number, primeSign, evenSign, repeatedSign);
      }
      
      // Close the files.
      numberFile.close();
      numberTableFile.close();
   }
   
   /**
      The isPrime method test whether a number is a prime number.
      @param num The integer to be tested.
      @return True if the number is prime and false if it is not. 
   */
   
   public static boolean isPrime(int num)
   {
      for (int n = 2; n < num; n++) // Check if number is divisble by any other
         if (num % n == 0)          // that isn't 1 or the number itself
            return false;
      
      return true;
   }
   
   /**
      The isEven method test whether a number is an even number.
      @param num The integer to be tested.
      @return True if the number is even and false if it is odd. 
   */
   
   public static boolean isEven(int num)
   {
      if (num % 2 == 0)  // Return true if num is even
         return true;
      else 
         return false;  // Return false if num is odd
   }
   
   /**
      The isRepeatedDigits method test whether a number has repeating and 
      adjacent digits.
      @param num The integer to be tested.
      @return True if the number is has repeating digits and false if it 
      does not. 
   */
   
   public static boolean isRepeatedDigits(int num)
   {
      String numStr = Integer.toString(num);
      int length = numStr.length();
      for (int count = 0; count < (length - 1); count++)
         {
            char ch1 = numStr.charAt(count); 
            char ch2 = numStr.charAt(count + 1);
            if (ch1 == ch2)
               return true;
         }
      return false;
   }
}